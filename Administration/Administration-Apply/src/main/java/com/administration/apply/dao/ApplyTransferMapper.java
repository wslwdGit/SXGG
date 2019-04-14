package com.administration.apply.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.administration.apply.pojo.ApplyTransfer;


@Mapper
public interface ApplyTransferMapper {
	/**
	 * 内部转账
	 * @param map
	 * @return
	 */
     List<ApplyTransfer> findApplyTransfer(Map<Object, Object> map);
}