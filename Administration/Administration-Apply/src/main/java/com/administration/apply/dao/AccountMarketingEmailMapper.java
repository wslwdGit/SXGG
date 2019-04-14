package com.administration.apply.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.administration.apply.pojo.AccountMarketingEmail;

@Mapper
public interface AccountMarketingEmailMapper {
    
	/**
	 * 市场营销
	 * @param map
	 * @return
	 */
	List<AccountMarketingEmail> findAccountMarket(Map<Object, Object> map);
}