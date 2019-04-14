package com.administration.subject.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.administration.subject.dao.CrmUserMapper;
import com.administration.subject.pojo.CrmUser;

@Service
public class TestServiceImp {
	
	@Autowired
    private CrmUserMapper dao;
	
	 
	/**
	 * 用户验证
	 * @param name
	 * @param pwd
	 * @return
	 */
	public CrmUser getUserService(String name,String pwd) {
		return dao.getUser(name, pwd);
	}
	
	
}
