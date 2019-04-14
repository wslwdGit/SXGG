package com.administration.apply.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.apply.dao.ApplyLoginMapper;
import com.administration.apply.pojo.ApplyLogin;


@Service
public class ApplyLoginServiceImp {
     
	@Autowired
	private ApplyLoginMapper applyLoginMapper;
	
	/**
	 * 同名账户查询
	 * @param map
	 * @return
	 */
	public List<ApplyLogin> findApplyLoginService(Map<Object, Object> map){
		return applyLoginMapper.findApplyLogin(map);
	}
}
