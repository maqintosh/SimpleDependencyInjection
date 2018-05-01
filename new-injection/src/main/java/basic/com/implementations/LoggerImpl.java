package basic.com.implementations;

import java.util.Date;

import basic.com.usersAPI.Logger;

public class LoggerImpl implements Logger {
	private String name;
	private float version;
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Log -> " + name +" v" +version +" "+" \ndata logowania to: "+new Date() + ": " + message);
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public void setVersion(float version) {
		// TODO Auto-generated method stub
		this.version=version;
	}

}
