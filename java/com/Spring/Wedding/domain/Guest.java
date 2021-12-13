package com.Spring.Wedding.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guest {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Id
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private Integer tableNumber;

	@Override
	public String toString() {
		return "Guest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", tableNumber="
				+ tableNumber + "]";
	}

	
	
	
	public Guest(Integer id, String firstName, String lastName, Integer tableNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tableNumber = tableNumber;
	}


	
	


	public Guest(String firstName, String lastName, Integer tableNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.tableNumber = tableNumber;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(Integer tableNumber) {
		this.tableNumber = tableNumber;
	}
	
	
	
	
	
	
}
