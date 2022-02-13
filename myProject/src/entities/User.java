package entities;


import abstracts.Entity;

public class User implements Entity {
	private int id;
	private long identityNumber;
	private String name;
	private String surname;
	private String gender;
	private int birthYear;
	
	public User() {
		
	}
	
	public User(int id, long identityNumber, String name, String surname, String gender, int birthYear) {
		this.id = id;
		this.identityNumber = identityNumber;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getIdentityNumber() {
		return identityNumber;
	}

	public void setIdendityNumber(long identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
