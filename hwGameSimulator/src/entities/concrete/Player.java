package entities.concrete;

import java.time.LocalDate;

import entities.abstracts.Entity;

public class Player implements Entity {
	

	public Player() {
		
	}
	
	private int Id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String nationalityId;
	private String level = "1";
	
	public Player(int Id,String firstName,String lastName,LocalDate birthDate,
			String nationalityId,String level) {
		
		this.birthDate=birthDate;
		this.firstName=firstName;
		this.Id=Id;
		this.lastName=lastName;
		this.level=level;
		this.nationalityId=nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate localDate) {
		this.birthDate = localDate;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getLevel() {
		return level;
	}

	
	
}
