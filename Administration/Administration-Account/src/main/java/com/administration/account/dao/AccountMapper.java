package com.administration.account.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.administration.account.pojo.Account;

@Mapper
public interface AccountMapper {
     
	/**
	 * 准账户列表
	 * @param map
	 * @return
	 */
	List<Account> FindAccount(Map<Object, Object> map);
}