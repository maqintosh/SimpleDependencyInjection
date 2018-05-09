package org.cieslinski.main;

import java.util.Locale;

public class User {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	private String name;
	private int age;
	private Locale locale;
	
	public User(String name, int age, Locale locale) {
		this.name = name;
		this.locale = locale;
		this.age = age;
	}
}
