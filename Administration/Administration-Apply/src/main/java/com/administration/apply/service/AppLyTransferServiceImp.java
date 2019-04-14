package com.administration.apply.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.apply.dao.ApplyTransferMapper;
import com.administration.apply.pojo.ApplyTransfer;


@Service
public class AppLyTransferServiceImp {
	
	@Autowired
    private ApplyTransferMapper applyTransferMapper;
	
	/**
	 * 内部转账查询
	 * @param map
	 * @return
	 */
	public List<ApplyTransfer> findApplyTransferService(Map<Object, Object> map){
		return applyTransferMapper.findApplyTransfer(map);
	}
}
