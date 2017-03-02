package com.imooc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Firstlistener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		

	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	String initParam=	arg0.getServletContext().getInitParameter("initParam");
	System.out.println(initParam);
	}

}
