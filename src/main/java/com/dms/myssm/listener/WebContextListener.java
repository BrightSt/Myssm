package com.dms.myssm.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@SuppressWarnings("rawtypes")
public class WebContextListener implements ServletContextListener  {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("################################"+222222);
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("##############################"+111111111);
		
	}


}
