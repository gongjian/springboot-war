package org.james.service.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SequenceBean implements InitializingBean, DisposableBean {
	
	public void init() {
		System.out.println("init.");
	}
	
	@PostConstruct
	public void postContruct() {
		System.out.println("postContruct.");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean, afterPropertiesSet.");
	}
	
	public void des() {
		System.out.println("des.");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean, destory.");
	}

}
