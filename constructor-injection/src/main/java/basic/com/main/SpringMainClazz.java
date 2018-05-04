package basic.com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.com.domain.User;
import basic.com.usersAPI.UsersRepository;

public class SpringMainClazz {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
		
		UsersRepository usersRepository = context.getBean("UsersRepo", UsersRepository.class);
		
		User docker = usersRepository.createUser("DockerMan");
		
	
	}

}
