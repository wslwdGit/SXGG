package com.administration.apply.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.administration.apply.pojo.ApplyPassword;
import com.administration.apply.service.ApplyPasswordServiceImp;

@RestController
@RequestMapping("/applypassword")
public class ApplyPasswordController {

	@Autowired
	private ApplyPasswordServiceImp applyPasswordServiceImp;
	
	/**
	 * 交易密码
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/findPasssword",method = RequestMethod.POST)
	public List<ApplyPassword> findPasswordController(@RequestBody Map<Object, Object> map){
		List<ApplyPassword> applyPasswords=applyPasswordServiceImp.findPasswordService(map);
		return applyPasswords;
	} 
}
