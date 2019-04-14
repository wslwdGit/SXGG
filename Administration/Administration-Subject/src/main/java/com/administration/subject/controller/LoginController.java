package com.administration.subject.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.administration.subject.pojo.CrmUser;

/**
 * 用户登陆
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/user")
public class LoginController {
	
	//private static Logger logger = Logger.getLogger(LoginController.class); 
    
	/**
	 * 用户登陆接口
	 * @param user  账户密码
	 * @param model 
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping("/login")
	public Object login(String useremail,String userpwd) throws ServletException, IOException   {
		Map<String, String> map;
		if (useremail == null 
		    || useremail.length() == 0
			|| userpwd == null 
			|| userpwd.length() == 0) 
		{
			//账号密码为空 直接返回登陆页面
			 map=new HashMap<String, String>();
			 map.put("type", "error");
			 map.put("msg", "1:用户名或密码为空");
			 return map;
		};

		userpwd=DigestUtils.md5DigestAsHex(userpwd.getBytes());
		//创建一个Shiro用户
		Subject subject = SecurityUtils.getSubject();
		//存入用户输入登陆信息
		UsernamePasswordToken token = new UsernamePasswordToken(useremail, userpwd);
		try {
			//进行验证 跳转自定义类 CustomRealmShiroUtil doGetAuthenticationInfo方法
			subject.login(token);
			
			map=new HashMap<String, String>();
			map.put("type", "success");
			map.put("msg", "3:登陆成功");
			return map;
			
		} catch (Exception e) {
			
			map=new HashMap<String, String>();	
			map.put("type", "error");

			if(e.getMessage().equals("error")) {
				
			map.put("msg", "2:用户名或密码错误");
			
			}
			return map; 
		}
		
	}
}
