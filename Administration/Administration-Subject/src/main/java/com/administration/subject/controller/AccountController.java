package com.administration.subject.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.administration.subject.pojo.Account;
import com.administration.subject.service.AccountServiceImp;
import com.administration.subject.util.MyMap;

@RestController
@RequestMapping("/account")
public class AccountController {

	//返回map的key
    private String [] retkey= {"data","total","state"}; 
	
	@Autowired
	private AccountServiceImp accountservice;
	
	@RequestMapping("/FindAccount")
	public Map<Object, Object> FindAccountcontroller(@RequestParam(value = "key[]") String [] key,
	    @RequestParam(value = "value[]") String [] value) {
		Map<Object, Object> map=new HashMap<Object, Object>();
		//map 存参数存值
        map=MyMap.setMap(key, value, map);
        try {
        	List<Account> applyAccounts=accountservice.FindAccountService(map);
        	map=new HashMap<Object, Object>();
	         //map 存返回值
	       	map=MyMap.tryMap(applyAccounts,map,retkey,false);
		} catch (IllegalStateException e) {
			//map 存返回值
    		map=new HashMap<Object, Object>();
    		map=MyMap.tryMap(null,map,retkey,true);
		} catch (Exception e) {
			map=new HashMap<Object, Object>();
    		map=MyMap.tryMap(null,map,retkey,true);
		}
		return map;
	}
	
}
