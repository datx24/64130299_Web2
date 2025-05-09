package edu.datnx.models;

public class User {
	private String id;
	private String password;
	private String name;
	private int birthYear;
	private String gender;
	
	public User(String id, String password, String name, int birthYear, String gender) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthYear = birthYear;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
