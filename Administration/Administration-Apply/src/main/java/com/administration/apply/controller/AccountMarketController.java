package com.administration.apply.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.administration.apply.pojo.AccountMarketingEmail;
import com.administration.apply.service.AccountMarketServiceImp;

@RestController
@RequestMapping("/accountMarket")
public class AccountMarketController {

	@Autowired
	private AccountMarketServiceImp accountMarketServiceImp;
	
	@RequestMapping(value = "/findAccountMarket",method = RequestMethod.POST)
	public List<AccountMarketingEmail> findAccountMarketController(@RequestBody Map<Object, Object> map){
		List<AccountMarketingEmail> accountMarketingEmails=accountMarketServiceImp.findAccountMarketService(map);
		return accountMarketingEmails;
	}
}
