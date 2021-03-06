package com.dms.myssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionInterceptor implements HandlerInterceptor{
	
  Logger logger = LoggerFactory.getLogger(SessionInterceptor.class);
  protected int sessionTimeOutCode = 999;
  
  public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
      Exception arg3) throws Exception {
    System.out.println("afterCompletion...");
    
  }

  
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2,
      ModelAndView modelAndView) throws Exception {
  }

  /**
   * 到达controller前进行session判断
   */
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2)
      throws Exception {
	  return true;
  }
}
