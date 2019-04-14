package com.administration.subject.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.administration.subject.pojo.AccountMarketingEmail;
import com.administration.subject.pojo.ApplyLeverage;
import com.administration.subject.pojo.ApplyLogin;
import com.administration.subject.pojo.ApplyPassword;
import com.administration.subject.pojo.ApplyTransfer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ApplyLeverageServiceImp {

	@Autowired
    private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "finApplyLeverageServiceError")
	public List<ApplyLeverage> finApplyLeverageService(Map<Object, Object> map){
	 
		ApplyLeverage [] object= 
		restTemplate.postForObject("http://APPLY-CLIENT/applylever/FindApplyLeverage",map,ApplyLeverage [].class);
		List<ApplyLeverage> applyLeverages=Arrays.asList(object);
		return applyLeverages;
	}
	public List<ApplyLeverage> finApplyLeverageServiceError(Map<Object, Object> map) throws Exception {
		System.out.println("熔断");
		throw new java.lang.IllegalStateException();
    }
	
	
	
	
	
	@HystrixCommand(fallbackMethod = "FindApplyTransferServiceError")
	public List<ApplyTransfer> FindApplyTransferService(Map<Object, Object> map){
		ApplyTransfer [] object=
				restTemplate.postForObject("http://APPLY-CLIENT/applytransfer/FindApplyTransfer",map,ApplyTransfer [].class);
		List<ApplyTransfer> applyTransfers=Arrays.asList(object);
		return applyTransfers;
	}
	public List<ApplyTransfer> FindApplyTransferServiceError(Map<Object, Object> map) throws Exception{
		System.out.println("熔断");
		throw new java.lang.IllegalStateException();
	}
	
	
	
	@HystrixCommand(fallbackMethod = "FindApplyLoginServiceError")
	public List<ApplyLogin> FindApplyLoginService(Map<Object, Object> map){
		ApplyLogin [] object=
				restTemplate.postForObject("http://APPLY-CLIENT/applylogin/FindApplyLogin",map,ApplyLogin [].class);
		List<ApplyLogin> applyTransfers=Arrays.asList(object);
		return applyTransfers;
	}
	public List<ApplyLogin> FindApplyLoginServiceError(Map<Object, Object> map) throws Exception{
		System.out.println("熔断");
		throw new java.lang.IllegalStateException();
	}
	
	
	
	@HystrixCommand(fallbackMethod = "FindApplyPasswordServiceError")
	public List<ApplyPassword> FindApplyPasswordService(Map<Object, Object> map){
		ApplyPassword [] object=
				restTemplate.postForObject("http://APPLY-CLIENT/applypassword/findPasssword",map,ApplyPassword [].class);
		List<ApplyPassword> applyPasswords=Arrays.asList(object);
		return applyPasswords;
	}
	public List<ApplyPassword> FindApplyPasswordServiceError(Map<Object, Object> map) throws Exception{
		System.out.println("熔断");
		throw new java.lang.IllegalStateException();
	}
	
	
	
	//@HystrixCommand(fallbackMethod = "FindAccountMarketingEmailSerivceError")
	public List<AccountMarketingEmail> FindAccountMarketingEmailSerivce(Map<Object, Object> map){
		AccountMarketingEmail [] object=
				restTemplate.postForObject("http://APPLY-CLIENT/accountMarket/findAccountMarket",map,AccountMarketingEmail [].class);
		List<AccountMarketingEmail> accountMarketingEmails=Arrays.asList(object);
		return  accountMarketingEmails;
	}
	public List<AccountMarketingEmail> FindAccountMarketingEmailSerivceError(Map<Object, Object> map) throws Exception{
		System.out.println("熔断");
		throw new java.lang.IllegalStateException();
	}
	
	
	
	@HystrixCommand(fallbackMethod = "updateApplyLeveageServiceError")
	public String updateApplyLeveageService(Map<Object, Object> map) {
		String ret=
		restTemplate.postForObject("http://APPLY-CLIENT/applylever/UpdateApply", map, String.class);
		return ret;
	}
	/**
	 * 熔断
	 * @return
	 * @throws Exception 
	 */
	public String updateApplyLeveageServiceError(Map<Object, Object> map) throws Exception {
		System.out.println("熔断");
		throw new java.lang.IllegalStateException();
    }
	
	
	
	 
	
	
}
