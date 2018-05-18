package com.bean.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.arraybean.SomeBean;
import com.bean.user.Address;
import com.bean.user.User;

public class SpringMainClazz {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");

		// Address address = context.getBean("address" , Address.class);
		// System.out.println(address.toString());
		User user = context.getBean("user", User.class);
		System.out.println(user.toString());
		User user2 = context.getBean("user2", User.class);
		System.out.println(user2.toString() +"\n");
		
		SomeBean bean = context.getBean("someBean" , SomeBean.class);
		System.out.println("LISTY: \n \t" +bean.getIntegerList() +"\n \t" + bean.getLongArray() + "\n \t" + bean.getStringList());
		
	}

}
