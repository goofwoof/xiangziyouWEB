package com.xzy.spring;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzy.mybatis.dao.AreasMapper;
import com.xzy.mybatis.dao.MybatisUtil;
import com.xzy.mybatis.pojo.Areas;
import com.xzy.mybatis.pojo.AreasExample;

@Controller
public class areaController {
	AreasMapper am = (AreasMapper) MybatisUtil.getMapper(AreasMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	/**
	 * 根据城市名返回景点列表
	 * @param cityname
	 * @return List<Areas>景区列表
	 */
	@RequestMapping (value="/getAreasList.do", method=RequestMethod.POST)
	public @ResponseBody List<Areas> getAreasList(@RequestParam String cityname){
		AreasExample ae = new AreasExample();
		com.xzy.mybatis.pojo.AreasExample.Criteria c = ae.createCriteria();
		c.andCityEqualTo(cityname);
		System.out.println("getAreasList.do//"+cityname);
		return am.selectByExample(ae);
	}
	
	/**
	 * 景点位置信息补充
	 * @param area 补充位置信息的景点的序列化对象
	 * @return int 添加状态
	 */
	@RequestMapping (value="/addAreasLocal.do", method=RequestMethod.POST)
	public @ResponseBody int addAreasLocal(@RequestParam String area){
		Areas areas = null;
		try {
			areas = mapper.readValue(area,Areas.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(areas.getAddress().replaceAll("\\\"", "\""));
		AreasExample ae = new AreasExample();
		com.xzy.mybatis.pojo.AreasExample.Criteria c = ae.createCriteria();
		c.andIdEqualTo(areas.getId());
		System.out.println("addAreasLocal.do//"+areas.toString());
		return am.updateByExampleSelective(areas, ae);
		
	}
}
