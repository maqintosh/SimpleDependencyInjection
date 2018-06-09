package org.cieslinski.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class MainCLAZZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Component1 compo1 = context.getBean("compo1",Component1.class);
		Component2 compo2 = context.getBean("compo2",Component2.class);
		
		System.out.println(compo1.getUsersRepository().getInstanceNumber());
		System.out.println(compo2.getUsersRepository().getInstanceNumber());
		
		System.out.println(context.getBean("usersRepository",UsersRepository.class).getInstanceNumber());
		System.out.println(context.getBean("usersRepository",UsersRepository.class).getInstanceNumber());
		System.out.println(context.getBean("usersRepository",UsersRepository.class).getInstanceNumber());
		System.out.println(context.getBean("usersRepository",UsersRepository.class).getInstanceNumber());

		
	}

}
