package com.Spring.Wedding.service;

import java.util.ArrayList;
import java.util.List;

import com.Spring.Wedding.domain.Guest;

public class GuestServiceList implements GuestService{
	
	
private List<Guest> newGuest = new ArrayList<>();
	
@Override
	public Guest createGuest( Guest newGuest) {
		this.newGuest.add(newGuest);
		Guest created = this.newGuest.get(this.newGuest.size()-1);
		return created;
    }
	
@Override
	public List<Guest> getAllNewGuest(){
		return this.newGuest;
	}
	
	
@Override
	public Guest getNewGuestById( Integer id) {
		return this.getNewGuestById(id);
	}
	

@Override
	public Guest getNewGuestByLastName( String lastName) {
		return null;
	}
	
@Override
	public Guest replaceGuest( Integer id, Guest newGuest) {
		System.out.println("ID: " + id);
		System.out.println("NEW GUEST: " + newGuest);
		return null;
	}
	
@Override
	public void removeNewGuest( Integer id) {
		System.out.println("ID :" + id);
	}




}


