package com.hibernate;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class User {
	
	@Id
	private int Id;
	private String name;
	private String gender;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
