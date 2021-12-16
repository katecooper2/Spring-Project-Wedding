package com.Spring.Wedding.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.Wedding.domain.Guest;

@Repository
public interface GuestRepo extends JpaRepository<Guest, Integer> {
	
	Guest getAllByTableNumber(Integer tableNumber);
	Guest getAllByLastName(String lastName);

}