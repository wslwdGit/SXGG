package com.administration.apply.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.administration.apply.pojo.ApplyLeverage;

@Mapper
public interface ApplyLeverageMapper {
	/**
	 * 
	 * @param serial 流水号  status 状态  name  姓名 pagefirst 首页 pagelast  尾页
	 * @return
	 */
      List<ApplyLeverage> FindApplyLeverage(Map<Object, Object> map);
      /**
       	*审批
       * @param status
       * @param comment
       * @param approveuser
       * @param id
       * @return
       */
      Integer UpdateApply(Map<Object, Object> map); 
}