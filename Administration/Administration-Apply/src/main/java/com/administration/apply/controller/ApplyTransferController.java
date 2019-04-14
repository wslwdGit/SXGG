package com.administration.apply.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.administration.apply.pojo.ApplyTransfer;
import com.administration.apply.service.AppLyTransferServiceImp;

@RequestMapping("/applytransfer")
@RestController
public class ApplyTransferController {

	   @Autowired
       private AppLyTransferServiceImp transferSerice;
	   
	   /**
	    * 内部转账
	    * @param map
	    * @return
	    */
	   @RequestMapping(value = "/FindApplyTransfer", method =RequestMethod.POST)
	   public List<ApplyTransfer> findApplyTransferController(@RequestBody Map<Object, Object> map) {
		   List<ApplyTransfer> list=transferSerice.findApplyTransferService(map);
	       return list;
	   }
}
