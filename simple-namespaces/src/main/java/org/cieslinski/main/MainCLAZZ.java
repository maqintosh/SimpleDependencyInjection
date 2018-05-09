package org.cieslinski.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCLAZZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SampleBean sampleBean = context.getBean("sampleBean",SampleBean.class);
		System.out.println(sampleBean.getStringValue());
		
		SampleBean sampleBean2 = context.getBean("sampleBean2",SampleBean.class);
		System.out.println(sampleBean2.getUser().getName() + "\n" + sampleBean2.getStringValue());
		
		
		
	}

}
