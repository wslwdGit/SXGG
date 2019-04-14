package com.administration.apply.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.administration.apply.pojo.ApplyPassword;

@Mapper
public interface ApplyPasswordMapper {
     
	/**
	 * 交易密码
	 * @param map
	 * @return
	 */
	List<ApplyPassword> findPassword(Map<Object, Object> map);
}