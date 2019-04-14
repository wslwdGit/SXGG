package com.administration.subject.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.administration.subject.pojo.Account;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AccountServiceImp {

	@Autowired
    private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "FindAccountServiceError")
	public List<Account> FindAccountService(Map<Object, Object> map){
		Account [] object= 
				restTemplate.postForObject("http://ACCOUNT-CLIENT/account/FindAccountAll",map,Account [].class);
				List<Account> accounts=Arrays.asList(object);
				map=new HashMap<Object, Object>();
				return accounts;
	}
	
	/**
	 * 熔断
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<Account> FindAccountServiceError(Map<Object, Object> map) throws Exception{
		throw new java.lang.IllegalStateException();
	}
}
