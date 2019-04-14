package com.administration.subject.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.administration.subject.pojo.AccountMarketingEmail;
import com.administration.subject.pojo.ApplyLeverage;
import com.administration.subject.pojo.ApplyLogin;
import com.administration.subject.pojo.ApplyPassword;
import com.administration.subject.pojo.ApplyTransfer;
import com.administration.subject.pojo.CrmUser;
import com.administration.subject.service.ApplyLeverageServiceImp;
import com.administration.subject.util.MyMap;


@RestController
@RequestMapping("/ApplyLeverage")
public class ApplyLeverageController {
   
    @Autowired
	private ApplyLeverageServiceImp applyleverageserviceimp;
    
    //返回map的key
    private String [] retkey= {"data","total","state"};  
    
	
	/**
	 * 查询杠杆比例
	 * @param serial
	 * @param status
	 * @param name
	 * @param pagefirst
	 * @param pagelast
	 * @return
	 */
	@RequestMapping(value="/FindApplyLeverage",method = RequestMethod.POST)
    public Map<Object, Object> FindApplyLeverageController(@RequestParam(value = "key[]") String [] key,
    	@RequestParam(value = "value[]") String [] value) {
		//创建map容器
        Map<Object, Object> map=new  HashMap<Object, Object>();
        //map 存参数存值
        map=MyMap.setMap(key, value, map);
        try {
        	//获取集合
        	List<ApplyLeverage> applyLeverages=applyleverageserviceimp.finApplyLeverageService(map);
	        map=new HashMap<Object, Object>();
	        
	        //map 存返回值
        	map=MyMap.tryMap(applyLeverages,map,retkey,false);
        } catch (IllegalStateException e) {//超时 短路异常
        	//map 存返回值
    		map=new HashMap<Object, Object>();
    		map=MyMap.tryMap(null,map,retkey,true);
        }
        return  map;     
    }
	
	
	
	
	/**
	 * 内部转账查询
	 * @param status
	 * @param serial
	 * @param from
	 * @param to
	 * @param pagefirst
	 * @param pagelast
	 * @return
	 */
	@RequestMapping(value="/FindApplyTransfer",method = RequestMethod.POST)
	public Map<Object, Object> FindApplyTransferController(@RequestParam(value = "key[]") String [] key,
	    	@RequestParam(value = "value[]") String [] value){
		 	Map<Object, Object> map=new HashMap<Object, Object>(); 
		 	map=MyMap.setMap(key, value, map);
	        try {
	        	List<ApplyTransfer> applyTransfers=applyleverageserviceimp.FindApplyTransferService(map);
		        map=new HashMap<Object, Object>();
	        	map=MyMap.tryMap(applyTransfers,map,retkey,false);
	        } catch (IllegalStateException e) {
	    		map=new HashMap<Object, Object>();
	    		map=MyMap.tryMap(null,map,retkey,true);
	        }
	        
	        return map;
	}
	
	
	/**
	 * 同名账户
	 * @param serial
	 * @param presentlogin
	 * @param status
	 * @param pagefirst
	 * @param pagelast
	 * @return
	 */
	@RequestMapping(value="/FindApplyLogin",method=RequestMethod.POST)
	public Map<Object, Object> FindApplyLoginController(@RequestParam(value = "key[]") String [] key,
	    	@RequestParam(value = "value[]") String [] value){
		 	Map<Object, Object> map=new HashMap<Object, Object>(); 	
		 	map=MyMap.setMap(key, value, map);
	        try {
	        	List<ApplyLogin> applyLogins=applyleverageserviceimp.FindApplyLoginService(map);
		        map=new HashMap<Object, Object>();
	        	map=MyMap.tryMap(applyLogins,map,retkey,false);
	        } catch (IllegalStateException e) {
        		map=new HashMap<Object, Object>();
        		map=MyMap.tryMap(null,map,retkey,true);
	        }
	        return map;
	}
	
	
	
	 
	/**
	 * 交易密码查询
	 * @param status
	 * @param login
	 * @param pagefirst
	 * @param pagelast
	 * @return
	 */
	@RequestMapping(value="/FindApplyPassword",method=RequestMethod.POST)
    public Map<Object, Object> FindApplyPasswordController(@RequestParam(value = "key[]") String [] key,
	    	@RequestParam(value = "value[]") String [] value){
	    	Map<Object, Object> map=new HashMap<Object, Object>(); 	
	    	map=MyMap.setMap(key, value, map);
	    	try {
	        	List<ApplyPassword> applyPasswords=applyleverageserviceimp.FindApplyPasswordService(map);
		        map=new HashMap<Object, Object>();
	        	map=MyMap.tryMap(applyPasswords,map,retkey,false);
	        } catch (IllegalStateException e) {
        		map=new HashMap<Object, Object>();
        		map=MyMap.tryMap(null,map,retkey,true);
	        }
	        return map;
    }
	
	
	/**
	 * 市场营销
	 * @param login
	 * @param name
	 * @param pagefirst
	 * @param pagelast
	 * @return
	 */
	@RequestMapping(value="/FindAccountMarketingEmail",method=RequestMethod.POST)
	public Map<Object, Object> FindAccountMarketingEmail(@RequestParam(value = "key[]") String [] key,
	    	@RequestParam(value = "value[]") String [] value){
			Map<Object, Object> map=new HashMap<Object, Object>(); 	
			map=MyMap.setMap(key, value, map);
			try {
	        	List<AccountMarketingEmail> accountMarketingEmails=applyleverageserviceimp.FindAccountMarketingEmailSerivce(map);
		        map=new HashMap<Object, Object>();
	        	map=MyMap.tryMap(accountMarketingEmails,map,retkey,false);
	        } catch (IllegalStateException e) {
        		map=new HashMap<Object, Object>();
        		map=MyMap.tryMap(null,map,retkey,true);
	        }
	        return map;
	}
	
	
	

	/**
	 * 审批
	 * @param comment
	 * @param status
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/UpdateApply",method = RequestMethod.POST)
	public Map<Object, Object> UpdateApplyController(@RequestParam(value = "key[]") String [] key,
	    	@RequestParam(value = "value[]") String [] value) {
		CrmUser object=(CrmUser) SecurityUtils.getSubject().getPrincipal();
		Integer approveuser=object.getId();
		String [] bykey= {"approveuser"};
		Integer [] byvalue= {approveuser};
		Map<Object, Object> map=new HashMap<Object, Object>();
		map=MyMap.setMapby(key, value,bykey,byvalue ,map);
		try {
			String ret=applyleverageserviceimp.updateApplyLeveageService(map);
			map=new HashMap<Object, Object>();
			map.put("msg",ret);
			map.put("state","200");
		} catch (IllegalStateException e) {
			map=new HashMap<Object, Object>();
			map.put("msg","连接失败");
			map.put("state","500");
		}catch (Exception e) {
			map=new HashMap<Object, Object>();
			map.put("msg","未知错误");
			map.put("state","500");
		}
		
		return map;
		
	}
	
	 
	
}
