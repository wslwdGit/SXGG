package com.administration.apply.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.apply.dao.AccountMarketingEmailMapper;
import com.administration.apply.pojo.AccountMarketingEmail;

@Service
public class AccountMarketServiceImp {

	@Autowired
	private AccountMarketingEmailMapper accountMarketingEmailMapper;
    
	/**
	 * 市场营销
	 * @param map
	 * @return
	 */
	public List<AccountMarketingEmail> findAccountMarketService(Map<Object, Object> map){
		return accountMarketingEmailMapper.findAccountMarket(map);
		
	}
}
