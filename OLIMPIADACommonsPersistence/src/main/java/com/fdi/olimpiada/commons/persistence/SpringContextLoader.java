package com.fdi.olimpiada.commons.persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author agonzalez
 *
 */

public class SpringContextLoader {

	private static ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/spring-master.xml"});
	
	public static ApplicationContext getContext() {
		return context;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBeanInstance(String idBean){
		return (T) context.getBean(idBean);
	}
	
}
