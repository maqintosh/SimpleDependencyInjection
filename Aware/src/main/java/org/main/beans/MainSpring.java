package org.main.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Context.xml");
		//AwareBean awarebean = applicationContext.getBean("awarebean1",AwareBean.class);
		//awarebean.setBeanName("O");
	}

}
