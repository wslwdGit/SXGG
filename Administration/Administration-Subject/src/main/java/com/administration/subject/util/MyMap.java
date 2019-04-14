package com.administration.subject.util;

import java.util.List;
import java.util.Map;

import com.administration.subject.pojo.ApplyLogin;

public class MyMap {
 
	
	


	
	/**
	 * 判断集合   返回类map
	 * @param <T>
	 * @param list 集合
	 * @param map 返回值  传入空map
	 * @param retkey 返回map的key数组
	 * @param exception 是否返回异常
	 * @return
	 */
	public static   <T> Map<Object, Object> tryMap(List<T> list,Map<Object, Object> map,
			String [] retkey,boolean exception){
		if(exception) {
			Object [] retvalue= {null,0,"500"};
    		map=setMap(retkey, retvalue, map);
    		return map;
		}
		if(list!=null && list.size()>0) {
			Object [] retvalue= {list,list.size(),"200"};
    		map=setMap(retkey, retvalue, map);
		}else {
			Object [] retvalue= {null,0,"200"};
    		map=setMap(retkey, retvalue, map);
		}
		return map;
	}
	
	/**
	 * map存值 key-value
	 * @param key
	 * @param value
	 * @param map
	 * @return
	 */
	public static Map<Object, Object> setMap(String [] key,Object [] value
			,Map<Object, Object> map){
		for (int i = 0; i < value.length; i++) {
			map.put(key[i], value[i]);
		}
		return map;
	}
	
	/**
	 * map存值  多对key-value数组
	 * @param key 
	 * @param value
	 * @param bykey
	 * @param byvalue
	 * @param map
	 * @return
	 */
	public static Map<Object, Object> setMapby(String [] key,Object [] value,
			String [] bykey,Object [] byvalue,Map<Object, Object> map){
		for (int i = 0; i < value.length; i++) {
			map.put(key[i], value[i]);
		}
		for (int i = 0; i < byvalue.length; i++) {
			map.put(bykey[i], byvalue[i]);
		}
		return map;
	}

	
}
