package com.xzy.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xzy.mybatis.dao.CityMapper;
import com.xzy.mybatis.dao.MybatisUtil;
import com.xzy.mybatis.pojo.City;
import com.xzy.mybatis.pojo.CityExample;


@Controller 
public class cityController {
	@Autowired  
    HttpServletRequest request;
	CityMapper cp = (CityMapper) MybatisUtil.getMapper(CityMapper.class);
	Logger log = LoggerFactory.getLogger("areaController"); 
	/**
	 * 根据城市名称，模糊匹配，返回城市列表
	 * @param id
	 * @param cityname
	 * @return List<City>城市列表
	 */
	@RequestMapping (value="/showCity.do", method=RequestMethod.POST)
	public @ResponseBody List<City> testJson(int id,@RequestParam String cityname) {
		log.info("showCity.do//"+cityname+id);
		CityExample cm = new CityExample();
		cm.createCriteria().andCitynameEqualTo(cityname);
		List<City> lic = cp.selectByExample(cm);
	    return lic;
	}
	/**
	 * 返回所有城市列表
	 * @return List<City>城市列表
	 */
	@RequestMapping (value="/getCityList.do", method=RequestMethod.GET)
	public @ResponseBody List<City> getCityList() {
		log.info("getCityList.do");
	    return cp.selectByExample(null);
	}

    @Resource(name="redisTemplate")
    private RedisTemplate<String, String> redisTemplate;
    /**
	 * 返回所有城市列表
	 * @return List<City>城市列表
	 */
	@RequestMapping (value="/Redistest.do", method=RequestMethod.GET)
	public void redistest() {
		log.info("Redistest.do");
		// stringRedisTemplate的操作
        // String读写
        //设置 redis 字符串数据
        redisTemplate.delete("myStr");
        redisTemplate.opsForValue().set("myStr", "skyLine");
        log.info(redisTemplate.opsForValue().get("myStr"));
        log.info("---------------");

        // List读写
        redisTemplate.delete("myList");
        redisTemplate.opsForList().rightPush("myList", "T");
        redisTemplate.opsForList().rightPush("myList", "L");
        redisTemplate.opsForList().leftPush("myList", "A");
        List<String> listCache = redisTemplate.opsForList().range("myList", 0, -1);
        for (String s : listCache) {
            log.info(s);
        }
        log.info("---------------");

        // Set读写
        redisTemplate.delete("mySet");
        redisTemplate.opsForSet().add("mySet", "A");
        redisTemplate.opsForSet().add("mySet", "B");
        redisTemplate.opsForSet().add("mySet", "C");
        Set<String> setCache = redisTemplate.opsForSet().members("mySet");
        for (String s : setCache) {
            log.info(s);
        }
        log.info("---------------");

        // Hash读写
        redisTemplate.delete("myHash");
        redisTemplate.opsForHash().put("myHash", "BJ", "北京");
        redisTemplate.opsForHash().put("myHash", "SH", "上海");
        redisTemplate.opsForHash().put("myHash", "HN", "河南");
        Map<Object, Object> hashCache = redisTemplate.opsForHash().entries("myHash");
        for (Map.Entry<Object, Object> entry : hashCache.entrySet()) {
            log.info(entry.getKey() + " - " + entry.getValue());
        }
        log.info("---------------");
	}
}
