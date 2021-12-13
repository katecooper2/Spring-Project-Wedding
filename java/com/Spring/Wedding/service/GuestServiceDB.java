package com.Spring.Wedding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Wedding.domain.Guest;
import com.Spring.Wedding.repo.GuestRepo;



@Service
public class GuestServiceDB implements GuestService{

	private GuestRepo repo;
	
	
	@Autowired
	public GuestServiceDB(GuestRepo repo) {
		super();
		this.repo = repo;
	}


	@Override
	public Guest createGuest(Guest newGuest) {
		
		return this.repo.save(newGuest);
	}


	@Override
	public List<Guest> getAllNewGuest() {
		
		return this.repo.findAll();
	}


	@Override
	public Guest getNewGuestById(Integer id) {
		
		return this.repo.getById(id) ;
	}


	@Override
	public Guest getNewGuestByLastName(String lastName) {
		
		return this.repo.getAllByLastName(lastName);
	}


	@Override
	public Guest replaceGuest(Integer id, Guest newGuest) {
		Guest existing = this.repo.getById(id);
		existing.setFirstName(newGuest.getFirstName());
		existing.setLastName(newGuest.getLastName());
		existing.setTableNumber(newGuest.getTableNumber());
		return this.repo.save(existing);
	}


	@Override
	public void removeNewGuest(Integer id) {
	this.repo.deleteById(id);
		
	}
	
}

