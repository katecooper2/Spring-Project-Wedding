package com.Spring.Wedding.service;

import java.util.List;

import com.Spring.Wedding.domain.Guest;

public interface GuestService {

	
	//create
	public Guest createGuest( Guest newGuest);
	
	//get all
	public List<Guest> getAllNewGuest();
	
	//get by id
	public Guest getNewGuestById( Integer id);
	
	//get by last name
	public Guest getNewGuestByLastName( String lastName);
	
	//replace
	public Guest replaceGuest( Integer id, Guest newGuest);
	
	//remove
	public void removeNewGuest( Integer id);

}

