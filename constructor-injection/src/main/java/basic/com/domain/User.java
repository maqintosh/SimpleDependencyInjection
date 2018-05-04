package basic.com.domain;

public class User {
	private String name;

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public User(String name) {
	
		this.name = name;
	}

}
