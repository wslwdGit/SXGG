package com.administration.apply.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.administration.apply.pojo.ApplyLeverage;
import com.administration.apply.pojo.ApplyLogin;
import com.administration.apply.pojo.ApplyTransfer;
import com.administration.apply.service.AppLyTransferServiceImp;
import com.administration.apply.service.ApplyLeverageServiceImp;
import com.administration.apply.service.ApplyLoginServiceImp;

@RestController
@RequestMapping("/applylever")
public class ApplyLeverageController {
	   @Autowired
       private ApplyLeverageServiceImp leverageService;
	   

	   
	   
	   
	   
	   
	   @RequestMapping("/test")
	   public String test() {
		   return "leverage";
	   }
	   
	   /**
	          *  查询杠杆比例接口
	    * @param map
	    * @return
	 * @throws InterruptedException 
	    */
	   @RequestMapping(value = "/FindApplyLeverage", method =RequestMethod.POST)
	   public Object findApplyLeverageController(@RequestBody Map<Object, Object> map) {
		   List<ApplyLeverage> applyLeverages=
		   leverageService.findApplyLeverageService(map);
		   return applyLeverages;
	   }
	   
	   

	   
	  
	   
	   
	   
	   /**
	    * 审批杠杆比例 , 内部转账 接口
	    * @param map
	    * @return
	    */
 
	   @RequestMapping(value = "/UpdateApply", method =RequestMethod.POST)
	   public String UpdateApplyLeverageController(@RequestBody Map<Object, Object> map) {
		   int ret=leverageService.UpdateApplyService(map);
		   if(ret>0) {
				return "success";
			}
			return "error";
	   }
	   
}
