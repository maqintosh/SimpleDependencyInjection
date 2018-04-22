package basic.com.implementations;

import basic.com.domain.User;
import basic.com.usersAPI.Logger;
import basic.com.usersAPI.UsersRepository;

public class UsersReporistoryImpl implements UsersRepository {
	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie Usera " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		// TODO Auto-generated method stub
		this.logger = logger;
	}

	
}
