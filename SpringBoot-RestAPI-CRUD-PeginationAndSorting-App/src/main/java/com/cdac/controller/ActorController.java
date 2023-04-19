package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.model.Actor;
import com.cdac.service.ActorService;

@RestController
public class ActorController {

	@Autowired
	private ActorService actorService;

	// insert 
	@PostMapping(value = "/actor")
	public String addActor(@RequestBody Actor actor) {
		actorService.add(actor);
		return "Actor added successfully";
	}

	
	// update
	@PutMapping(value = { "/actor" })
	public String updateActor(@RequestBody Actor actor) {
		actorService.update(actor);
		return "Actor updated successfully";
	}

	
	// delete
	@DeleteMapping(value = { "/actor" })
	public String deleteActor(@RequestParam int id) {
		System.out.println("first delete");
		actorService.deleteById(id);
		return "Actor deleted successfully";
	}
	

	// delete
	@DeleteMapping(value = { "/actor/{id}" })
	public String deleteActor1(@PathVariable int id) {
		System.out.println("second delete");
		actorService.deleteById(id);
		return "Actor deleted successfully";
	}

	
	// get by id
	@GetMapping(value = { "/actor/{id}" })
	public Actor getActorById(@PathVariable int id) {
		return actorService.getById(id);
	}

	
	// get all
	@GetMapping(value = { "/actors" })
	public List<Actor> getAllActors() {
		return actorService.getAll();
	}
	
	
	// get all with pages
	@GetMapping("/actorsPage")
	public List<Actor> getAllPaginatedActors(@RequestParam int pageNo, @RequestParam int pageSize) {
		
		return actorService.findAllActorsPaginated(pageNo, pageSize);

	}

	
	// get all with pages and sorted
	@GetMapping("/actorsPageAndSorted")
	public List<Actor> getAllPaginatedAndSortedActors(@RequestParam int pageNo, @RequestParam int pageSize, @RequestParam String field) {
		
		return actorService.findAllActorsPaginatedAndSorted(pageNo, pageSize, field);

	}

	
	// get by gender
	@GetMapping(value = { "/actorsGender" })
	public ResponseEntity<List<Actor>> getActorsByGender(@RequestParam String gender) {

		return new ResponseEntity<List<Actor>>(actorService.getActorsByGender(gender), HttpStatus.OK);

	}

	
	// get by industry
	@GetMapping(value = { "/actorsIndusrty" })
	public ResponseEntity<List<Actor>> getActorsByIndusrty(@RequestParam String industry) {

		return new ResponseEntity<List<Actor>>(actorService.getActorsByIndustry(industry), HttpStatus.OK);

	}

}
