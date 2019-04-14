package com.administration.apply.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.administration.apply.pojo.ApplyLogin;

@Mapper
public interface ApplyLoginMapper {
	/**
	 *  同名账户
	 * @param map
	 * @return
	 */
	List<ApplyLogin> findApplyLogin(Map<Object, Object> map);
}