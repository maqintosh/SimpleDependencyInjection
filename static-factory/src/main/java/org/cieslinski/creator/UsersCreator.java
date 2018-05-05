package org.cieslinski.creator;

import java.util.logging.Logger;

import org.cieslinski.main.User;

public class UsersCreator {
	Logger logger = Logger.getLogger(this.getClass().getName());

	public User createUser(String userName, int age) {
		logger.info("Stworzyles uzytkownika " + userName);
		User user = new User();
		user.setName(userName);
		user.setAge(age);
		return user;
	}

}
