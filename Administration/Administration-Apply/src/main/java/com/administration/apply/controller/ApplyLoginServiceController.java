package com.administration.apply.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.administration.apply.pojo.ApplyLogin;
import com.administration.apply.service.ApplyLoginServiceImp;

@RestController
@RequestMapping("/applylogin")
public class ApplyLoginServiceController {

	   @Autowired
	   private ApplyLoginServiceImp loginService;
	   
	   /**
	    * 同名账户
	    * @param map
	    * @return
	    */
	   @RequestMapping(value = "/FindApplyLogin", method =RequestMethod.POST)
	   public List<ApplyLogin> findApplyLoginController(@RequestBody Map<Object, Object> map){
		   List<ApplyLogin> list=loginService.findApplyLoginService(map);
		   return list;
	   }
}
