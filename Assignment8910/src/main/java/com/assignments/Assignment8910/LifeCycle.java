package com.assignments.Assignment8910;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean, DisposableBean, BeanNameAware {

	public void setBeanName(String name) {
		   System.out.println("Setting the Bean Name");
		// TODO Auto-generated method stub

	}

	public void destroy() throws Exception {
		 System.out.println("Destroying the Method");
		// TODO Auto-generated method stub

	}

	public void afterPropertiesSet() throws Exception {
		 System.out.println("Initializing the bean");
		// TODO Auto-generated method stub

	}

}
