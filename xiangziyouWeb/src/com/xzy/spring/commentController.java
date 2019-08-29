package com.xzy.spring;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzy.mybatis.dao.CommentsMapper;
import com.xzy.mybatis.dao.MybatisUtil;
import com.xzy.mybatis.pojo.CommentsExample;
import com.xzy.mybatis.pojo.Comments;

@Controller
public class commentController {
	CommentsMapper cm = (CommentsMapper) MybatisUtil.getMapper(CommentsMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	
	/**
	 * 这个类实现获取某景点的评论链表功能
	 * @param String area 景点名称
	 * 
	 * @return List<Comments> 景点评论列表
	 * */
	@RequestMapping (value="/getCommentsList.do", method=RequestMethod.POST)
	public @ResponseBody List<Comments> getCommentsList(@RequestParam String area){ 
		System.out.println("getCommentsList.do//"+area);
		CommentsExample ae = new CommentsExample();
		com.xzy.mybatis.pojo.CommentsExample.Criteria c = ae.createCriteria();
		c.andAreaEqualTo(area);
		return cm.selectByExample(ae);
	}
	
	/**
	 * 此函数实现添加评论的功能
	 * @param comment 串化的评论对象
	 * @return 执行结果类型
	 */
	@RequestMapping (value="/addComments.do", method=RequestMethod.POST)
	public int addComments(@RequestParam String comment){
		System.out.println("addComments.do//"+comment);
		Comments commnets = null;
		try {
			commnets = mapper.readValue(comment,Comments.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(commnets==null)return -1;
		return cm.insert(commnets);
	}
	
	/**
	 * 此函数实现删除评论的功能
	 * @param id 评论号
	 * @return 执行结果类型
	 */
	@RequestMapping (value="/deleteComments.do", method=RequestMethod.POST)
	public int deleteComments(@RequestParam int id) {
		return cm.deleteByPrimaryKey(id);
	}
	
	
}
