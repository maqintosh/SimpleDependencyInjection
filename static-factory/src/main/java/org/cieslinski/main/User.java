package org.cieslinski.main;

public class User {
	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
	}

	public static User getInstance(String name, int age) {
		User user = new User();
		user.name = name;
		user.age = age;
		return user;

	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
