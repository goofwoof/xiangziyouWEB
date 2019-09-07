package com.xzy.spring;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzy.mybatis.dao.ArealistInTrolleyMapper;
import com.xzy.mybatis.dao.MybatisUtil;
import com.xzy.mybatis.pojo.ArealistInTrolley;
import com.xzy.mybatis.pojo.ArealistInTrolleyExample;

@Controller
public class TrolleyController {
	ArealistInTrolleyMapper am = (ArealistInTrolleyMapper) MybatisUtil.getMapper(ArealistInTrolleyMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	

	@RequestMapping (value="/getTrolleyList.do", method=RequestMethod.POST)
	public @ResponseBody List<ArealistInTrolley> getCommentsList(@RequestParam String userid){
		if(userid.isEmpty())return new ArrayList<ArealistInTrolley>();
		System.out.println("getTrolleyList.do//"+userid);
		ArealistInTrolleyExample ae = new ArealistInTrolleyExample();
		com.xzy.mybatis.pojo.ArealistInTrolleyExample.Criteria c = ae.createCriteria();
		c.andUsernameEqualTo(userid);
		c.andStatusEqualTo(0);
		return am.selectByExample(ae);
	}
	
	@RequestMapping (value="/addTrolley.do", method=RequestMethod.POST)
	public int addTrolley(@RequestParam String arealistInTrolley){
		System.out.println("addTrolley.do//"+arealistInTrolley);
		ArealistInTrolley ait = null;
		try {
			ait = mapper.readValue(arealistInTrolley,ArealistInTrolley.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(ait==null)return -2;
		}
		if(ait==null)return -1;
		ait.setStatus(0);
		ait.getAp().replaceAll("\\\"", "\"");
		return am.insert(ait);
	}
	

	@RequestMapping (value="/deleteTrolley.do", method=RequestMethod.POST)
	public int deleteTrolley(@RequestParam int id,String userid) {
		
		//后续将删除的数据可以备份，进行数据分析
		ArealistInTrolleyExample ae = new ArealistInTrolleyExample();
		com.xzy.mybatis.pojo.ArealistInTrolleyExample.Criteria c = ae.createCriteria();
		c.andUsernameEqualTo(userid);
		c.andIdarealistInTrolleyEqualTo(id);
		return am.deleteByExample(ae);
	}
}
