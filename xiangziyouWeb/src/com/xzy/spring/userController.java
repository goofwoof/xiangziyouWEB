package com.xzy.spring;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xzy.mybatis.dao.MybatisUtil;
import com.xzy.mybatis.dao.UserMapper;
import com.xzy.mybatis.pojo.User;

@Controller 
public class userController {
	@Autowired  
    HttpServletRequest request;
	UserMapper um = (UserMapper) MybatisUtil.getMapper(UserMapper.class);
	ObjectMapper mapper = new ObjectMapper();
	Logger log = LoggerFactory.getLogger("areaController"); 
	/**
	 * 这是一个创建新用户的函数
	 * @param jsonofUser 序列化的用户对象（String of json）
	 * @return int 结果码【1:成功,-1:失败】
	 */
	@SuppressWarnings("null")
	@RequestMapping (value="/newUser.do", method=RequestMethod.POST)
	public @ResponseBody int newUser(@RequestParam String jsonofUser) {
		User user = null;
		try {
			user = mapper.readValue(jsonofUser,User.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("newUser.do//"+ user==null? "" : user.toString());
			return -1;
		}
		if(um.selectByPrimaryKey(user.getUsername())==null) {
			log.info("newUser.do//"+user.toString());
			return um.insertSelective(user); 
		}	
		log.error("newUser.do//"+user.toString());
		return -1;
	}
	/**
	 * 进行登录的函数
	 * @param id
	 * @param password
	 * @return User用户对象
	 */
	@RequestMapping (value="/login.do", method=RequestMethod.POST)
	public @ResponseBody User testJson(@RequestParam String id,String password) {
		if(request.getServletContext().getAttribute(id)!=null) {
			log.info("login.do//[已登录]"+id+"><"+password);
			return new User();
		}
		User account = um.selectByPrimaryKey(id);
		if(account==null) {
			log.error("login.do//[空账户]"+id+"><"+password);
			return null;
		}
		log.info(account.toString());
		if(account.getPassword().equals(password)) {
			log.info("login.do//[登录成功]"+id+"><"+password);
			request.getServletContext().setAttribute(id, "");
			if(request.getServletContext().getAttribute("accountTotal")==null) {
				request.getServletContext().setAttribute("accountTotal",1);
			}
			else {
				int T = (Integer)request.getServletContext().getAttribute("accountTotal");
				request.getServletContext().removeAttribute("accountTotal");
				request.getServletContext().setAttribute("accountTotal",T+1);
			}
			return account;
		}
		log.error("login.do//[密码错误]"+id+"><"+password);
		return new User();  
	}
}
