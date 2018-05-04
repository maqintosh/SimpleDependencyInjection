package basic.com.implementations;

import basic.com.domain.User;
import basic.com.usersAPI.Logger;
import basic.com.usersAPI.UsersRepository;

public class UsersReporistoryImpl implements UsersRepository {
	private Logger logger;

	public UsersReporistoryImpl(Logger logger, String path, String repoName) {
		this.logger = logger;
		logger.log("Lokalizacja repo to: " + path + repoName);

	}

	public User createUser(String name) {
		logger.log("Tworzenie Usera " + name);
		return new User(name);
	}

}
