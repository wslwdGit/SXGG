package com.administration.apply.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.apply.dao.ApplyPasswordMapper;
import com.administration.apply.pojo.ApplyPassword;

@Service
public class ApplyPasswordServiceImp {

	@Autowired
	private ApplyPasswordMapper applyPassword;

	/**
	 * 交易密码
	 * @param map
	 * @return
	 */
	public List<ApplyPassword> findPasswordService(Map<Object, Object> map){
		return applyPassword.findPassword(map);
	}
}
