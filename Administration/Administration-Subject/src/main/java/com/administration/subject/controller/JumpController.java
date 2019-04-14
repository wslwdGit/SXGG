package com.administration.subject.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面跳转
 * @author Administrator
 *
 */
@RestController
public class JumpController {

	
	 
	
	/**
	 * 用于页面跳转
	 * @param name 跳转页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/html/{name}")
	public Object holleword(@PathVariable String name,ModelAndView model) {
		String page="html/"+name;
		System.err.println("页面跳转："+page);
		model.setViewName(page);
		return model;
	}
	
	
	/**
	 * 用户登陆验证
	 * @param user
	 * @param model
	 * @return
	 * @throws ServletException
	 * @throws IOException
	 */
//	@RequestMapping("/login")
//	public Object login(Myuser user, ModelAndView model) throws ServletException, IOException   {
//		if (user.getUserName() == null 
//		    || user.getUserName().length() == 0
//			|| user.getPassword() == null 
//			|| user.getPassword().length() == 0) 
//		{
//			//账号密码为空 直接返回登陆页面
//			model.setViewName("html/login.html");
//			return model; 
//		};
//		
//		//创建一个Shiro用户
//		Subject subject = SecurityUtils.getSubject();
//		//存入用户输入登陆信息
//		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
//		try {
//			//进行验证 跳转自定义类 CustomRealmShiroUtil doGetAuthenticationInfo方法
//			subject.login(token);
//			model.setViewName("html/index.html");
//			return model; 
//		} catch (Exception e) {
//			model.setViewName("html/login.html");
//			return model; 
//		}
//		
//	}
//	
//	
//	/**
//	 * 测试权限
//	 * @return
//	 */
//	@RequiresRoles(value= {"admin"})
//	@RequestMapping("/test")
//	public List<Myuser> myUserListController() {
//		//System.out.println(1/0);
//		return testservice.myUserListService();
//	}

}
