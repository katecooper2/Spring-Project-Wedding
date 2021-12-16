package com.Spring.Wedding.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Wedding.domain.Guest;
import com.Spring.Wedding.service.GuestService;


@CrossOrigin

@RestController
public class GuestController {

	private GuestService service;
	
   
	
    public GuestController(GuestService service) {
	 super();
	 this.service = service;
 }
	
	@GetMapping("/Wedding Guestlist:") //endpoint
	public String GuestList() {
		return "Wedding GuestList:";
	}
	
	
	@PostMapping("/create") // 201 created
	public ResponseEntity<Guest> createGuest(@RequestBody Guest newGuest){ 
		Guest created = this.service.createGuest(newGuest);
		ResponseEntity<Guest> response = new ResponseEntity<Guest>(created, HttpStatus.CREATED);
		return response;
	
    }
	
	
	@GetMapping("/getAll") // 200
	public ResponseEntity<List<Guest>> getAllNewGuest(){
		return ResponseEntity.ok(this.service.getAllNewGuest());
	}
	
	
	@GetMapping("/Get/{id}") // 200
	public Guest getNewGuest(@PathVariable Integer id) {
		return this.service.getNewGuestById(id);
	}
	
	
	@GetMapping("/Get/{lastName}") // 200
	public Guest getNewGuest(@PathVariable String lastName) {
		return this.service.getNewGuestByLastName(lastName);
	}
	
	@PutMapping("/replace/{id}") // 202 Accepted
	public ResponseEntity<Guest> replaceNewGuest(@PathVariable Integer id, @RequestBody Guest newGuest){
	Guest body = this.service.replaceGuest(id, newGuest);
	ResponseEntity<Guest> response = new ResponseEntity<Guest>(body, HttpStatus.ACCEPTED);
	return response;
		
	}
	
	
	@DeleteMapping("/remove/{id}") // 204
	public ResponseEntity<?> removeGuest(@PathVariable Integer id) {
		this.service.removeNewGuest(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}



