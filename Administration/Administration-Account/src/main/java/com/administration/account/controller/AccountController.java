package com.administration.account.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.administration.account.pojo.Account;
import com.administration.account.service.AccountServiceImp;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountServiceImp accountServiceImp;
	
	
	/**
	 * 准账户查询
	 * @return
	 * @throws  
	 */
	@RequestMapping(value = "/FindAccountAll",method = RequestMethod.POST)
	public List<Account> FindAccountController(@RequestBody Map<Object, Object> map)  {
		return accountServiceImp.FindAccountSerivce(map);
	}
}
