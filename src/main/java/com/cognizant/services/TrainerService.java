package com.cognizant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.TrainerDao;
import com.cognizant.exceptions.TrainerNotFoundException;
import com.cognizant.model.Trainer;


/**
 * The Class TrainerService.
 */
@Service
public class TrainerService {
	
	/** The trainer dao. */
	@Autowired
	private TrainerDao trainerDao;

	/**
	 * Save trainer.
	 *
	 * @param trainer the trainer
	 * @return the int
	 */
	public int saveTrainer(Trainer trainer) {
		int result = trainerDao.save(trainer);
		return result;
	}

	/**
	 * Update password.
	 *
	 * @param trainer the trainer
	 * @return the int
	 */
	public int updatePassword(Trainer trainer) {
		int result = trainerDao.update(trainer);	
		return result;
	}

	/**
	 * Find trainer by id.
	 *
	 * @param id the id
	 * @return the trainer
	 * @throws TrainerNotFoundException the trainer not found exception
	 */
	public Trainer findTrainerById(int id) throws TrainerNotFoundException {
		Trainer trainer = trainerDao.findById(id);
		return trainer;
	}

}
