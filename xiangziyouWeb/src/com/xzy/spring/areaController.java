package com.xzy.spring;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xzy.mybatis.dao.AreasMapper;
import com.xzy.mybatis.dao.MybatisUtil;
import com.xzy.mybatis.pojo.Areas;
import com.xzy.mybatis.pojo.AreasExample;

@Controller
public class areaController {
	AreasMapper am = (AreasMapper) MybatisUtil.getMapper(AreasMapper.class);
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
}
