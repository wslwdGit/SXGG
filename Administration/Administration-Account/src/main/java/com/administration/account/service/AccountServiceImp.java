package com.administration.account.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.account.dao.AccountMapper;
import com.administration.account.pojo.Account;

@Service
public class AccountServiceImp {

	 @Autowired
	 private AccountMapper accountMapper;
	 
	  
	 /**
	  * 转帐户信息
	  * @param map
	  * @return
	  */
	 public List<Account> FindAccountSerivce(Map<Object, Object> map){
		 return accountMapper.FindAccount(map);
	 }
}
