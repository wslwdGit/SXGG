package com.administration.subject.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import com.alibaba.fastjson.JSONObject;

public class ShiroLoginFilter extends FormAuthenticationFilter     {	

 
	@Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        if (isAjax(request)) {
        	System.err.println("是ajax");
        	Map<Object, Object> map=new HashMap<>();
        	map.put("msg", "是ajax,请登陆");
            httpServletResponse.getWriter().write(JSONObject.toJSON(map).toString());
        } else {
            //saveRequestAndRedirectToLogin(request, response);
            /**
             * @Mark 非ajax请求重定向为登录页面
             */
        	System.err.println("不是ajax");
            httpServletResponse.sendRedirect("/html/login.html");
        }
        return false;
    }

    private boolean isAjax(ServletRequest request){
        String header = ((HttpServletRequest) request).getHeader("X-Requested-With");
        if("XMLHttpRequest".equalsIgnoreCase(header)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
 
 
}
 
