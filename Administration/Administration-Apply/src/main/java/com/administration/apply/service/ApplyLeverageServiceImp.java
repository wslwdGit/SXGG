package com.administration.apply.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administration.apply.dao.ApplyLeverageMapper;
import com.administration.apply.pojo.ApplyLeverage;



@Service
public class ApplyLeverageServiceImp {
    
	@Autowired
	private ApplyLeverageMapper applyLeverageMapper;
	
	
	/**
	 * 
	 * @param serial 流水号  status 状态  name  姓名 pagefirst 首页 pagelast  尾页
	 * @return
	 */
	public List<ApplyLeverage> findApplyLeverageService(Map<Object, Object> map){
		   List<ApplyLeverage> applyLeverages=
		   applyLeverageMapper.FindApplyLeverage(map);
		return applyLeverages;
	}
	
	/**
   	* 杠杆比例审批
   * @param status comment approveuser id
   * @return
   */
	public Integer UpdateApplyService(Map<Object, Object> map) {
		return applyLeverageMapper.UpdateApply(map);
	}
}
