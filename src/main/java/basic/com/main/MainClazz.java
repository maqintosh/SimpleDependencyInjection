package basic.com.main;

import basic.com.domain.User;
import basic.com.implementations.LoggerImpl;
import basic.com.implementations.UsersReporistoryImpl;
import basic.com.usersAPI.Logger;
import basic.com.usersAPI.UsersRepository;

public class MainClazz {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersReporistoryImpl();
		usersRepository.setLogger(logger);
		
		
		User user = usersRepository.createUser("JANUSZ DOCKER OPTIMUS");
	}

}
