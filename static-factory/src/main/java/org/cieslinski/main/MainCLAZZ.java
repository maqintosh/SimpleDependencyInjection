package org.cieslinski.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.text.AbstractDocument.Content;

import org.cieslinski.creator.UsersCreator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.core.Context;

public class MainCLAZZ {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Context.xml");
		Calendar calendar = applicationContext.getBean("calendar", Calendar.class);
		DateFormat format = (DateFormat) applicationContext.getBean("format");
		System.out.println(format.format(calendar.getTime()));
		
		User user = applicationContext.getBean("firstUser", User.class);
		System.out.println("Uzycie statycznej metody fabrykujacej -> "+ user);

		User usersInst = applicationContext.getBean("anotherUser", User.class);
		System.out.println("Uzycie instancyjnej metody fabrykujacej -> "+ usersInst);

		
		LocalClazz bean = applicationContext.getBean("mapy",LocalClazz.class);
		System.out.println(bean.getLocals());
		System.out.println(bean.getUstawienia());
		KeeperClazz bean2 = applicationContext.getBean("klasyczny",KeeperClazz.class);
		System.out.println(bean2.getBezimiennaClazz1().getImie());
		
		
		
		
	}

}
