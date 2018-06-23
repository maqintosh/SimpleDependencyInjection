package org.main.beans;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBean implements BeanNameAware, ApplicationContextAware {
	private String name;
	private ApplicationContext applicationContext;

	@Override
	public void setBeanName(String name) {
		this.name = name;
	}

	private void init() {
		Map<String, AwareBean> beansOfType = applicationContext.getBeansOfType(AwareBean.class);
		System.out.println("nazwa beana -> " + name);
		System.out.println("AppContext beana -> " + applicationContext.getDisplayName());
		System.out.println("Ilosc beanow wywolanych -> " + beansOfType.size());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
