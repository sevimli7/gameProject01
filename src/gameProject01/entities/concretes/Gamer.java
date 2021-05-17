package gameProject01.entities.concretes;

import java.time.LocalDate;

import gameProject01.core.Entity;

public class Gamer implements Entity{
	
	private int gamerId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityId;

public Gamer() {}

public Gamer(int gamerId, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
	super();
	this.gamerId = gamerId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.nationalityId = nationalityId;
}

public int getGamerId() {
	return gamerId;
}

public void setGamerId(int gamerId) {
	this.gamerId = gamerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public LocalDate getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getNationalityId() {
	return nationalityId;
}

public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
}




}

