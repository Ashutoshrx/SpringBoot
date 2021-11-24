package com.training.springBootstarter.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springBootstarter.entity.Participants;

@RestController
@RequestMapping("/prac")
public class TestController {

	List<Participants> listOfParticipants = new ArrayList<>(
			Arrays.asList(new Participants("Ashutosh Satapathy", 1, "Bangalore"),
					new Participants("Ankush Mourya", 2, "Pune"), new Participants("Rahul Pandey", 3, "Bombay")));

	@RequestMapping("getParticipants")
	List<Participants> getParticipants() {
		return listOfParticipants;
	}

	@RequestMapping("getById/{id}")
	Participants getPartsById(@PathVariable int id) {
		return listOfParticipants.stream().filter(ref -> ref.getPartId().equals(id)).findFirst().get();
	}

	@PostMapping("addParticipant")
	void addNewParticipant(@RequestBody Participants thePart) {
		try {
			listOfParticipants.add(thePart);
			System.out.println("User added");
		} catch (Exception e) {
			System.out.println("User was not added.." + e.getMessage());
		}
		for (Participants p : listOfParticipants)
			System.out.println(p);
	}

	@PutMapping("/updateById/{id}")
	void updateParticipantsById(@PathVariable int id, @RequestBody Participants thePart) {	
		int index=listOfParticipants.stream().map(ob->ob.getPartId()).collect(Collectors.toList()).indexOf(id);		
		listOfParticipants.set(index, thePart);		
		System.out.println("Updated..");
	}
		

	@DeleteMapping("/deleteById/{id}")
	void deleteParticipantsById(@PathVariable int id) {
		listOfParticipants.removeIf(ob -> ob.getPartId().equals(id));
		System.out.println("Participant removed..");

	}

}
