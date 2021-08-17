package com.cognizant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Trainer;
import com.cognizant.services.TrainerService;


/**
 * The Class TrainerController.
 */
@RestController
public class TrainerController {
	
	/** The trainer service. */
	@Autowired
	private TrainerService trainerService;
	
	/**
	 * Save trainer.
	 *
	 * @param trainer the trainer
	 * @return the response entity
	 */
	@PostMapping("/trainer")
	public ResponseEntity<Trainer> saveTrainer(@RequestBody Trainer trainer) {
		trainerService.saveTrainer(trainer);
		return new ResponseEntity<Trainer>(trainer, HttpStatus.CREATED);
	}
	
	/**
	 * Update password.
	 *
	 * @param id the id
	 * @param trainer the trainer
	 * @return the string
	 */
	@PutMapping("/trainer/{id}")
	public String updatePassword(@PathVariable int id, @RequestBody Trainer trainer) {
		Trainer trainer2 = trainerService.findTrainerById(id);
		trainer2.setPassword(trainer.getPassword());
		trainerService.updatePassword(trainer2);
		return "Data Updated Successfully!";
	}

}
