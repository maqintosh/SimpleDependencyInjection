package basic.com.implementations;

import java.util.Date;

import basic.com.usersAPI.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(new Date() + ": " + message);
	}

}
