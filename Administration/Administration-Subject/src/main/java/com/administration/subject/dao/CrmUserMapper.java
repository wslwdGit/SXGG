package com.administration.subject.dao;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.administration.subject.pojo.CrmUser;




@Mapper
public interface CrmUserMapper {
    
	/**
	 * 验证登陆 返回用户对象
	 * @param name
	 * @param pwd
	 * @return
	 */
	CrmUser getUser(@Param("name")String name,@Param("pwd")String pwd);
}