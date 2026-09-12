package com.spring.core.springInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements DisposableBean, InitializingBean {
	
	private int id;

	public void setId(int id) {
		System.out.println("Setter Method Called...");
		this.id = id;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Init Method Called...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method Called...");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	

}
