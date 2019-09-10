package com.xzy.spring;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzy.mybatis.dao.ArealistInTrolleyMapper;
import com.xzy.mybatis.dao.MybatisUtil;
import com.xzy.mybatis.pojo.ArealistInTrolley;

@Controller
public class CatchRouteController {
	ArealistInTrolleyMapper am = (ArealistInTrolleyMapper) MybatisUtil.getMapper(ArealistInTrolleyMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	Logger log = LoggerFactory.getLogger("areaController"); 
	/**
	 * 根据用户提交的景点列表，进行路径规划，返回经过路径规划的列表
	 * @param arealistInTrolley 待规划的景点列表
	 * @param userid 用户ID
	 * @return List<ArealistInTrolley> 调序后的景点列表
	 */
	@RequestMapping (value="/catchRoute.do", method=RequestMethod.POST)
	public List<ArealistInTrolley> catchRoute(@RequestParam String arealistInTrolley,@RequestParam String userid) {
		List<ArealistInTrolley> alist= null;
		try {
			alist = mapper.readValue(arealistInTrolley,new TypeReference<List<ArealistInTrolley>>() { });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//后期记录保存
		//路线规划，对景点队列进行排序，及生成合适的路线
		return alist;	
	}
}
