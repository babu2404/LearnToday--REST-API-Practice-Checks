package com.cognizant.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.exceptions.TrainerNotFoundException;
import com.cognizant.model.Trainer;
import com.cognizant.rowmappers.TrainerRowMapper;


/**
 * The Class TrainerDao.
 */
@Component
public class TrainerDao {
	
	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/** The row mapper. */
	@Autowired
	TrainerRowMapper rowMapper;

	/**
	 * Save.
	 *
	 * @param trainer the trainer
	 * @return the int
	 */
	public int save(Trainer trainer) {
		int result = jdbcTemplate.update("insert into trainer (trainer_id, password) values (?, ?)", new Object[] { trainer.getTrainerId(), trainer.getPassword() });
		return result;
	}
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the trainer
	 */
	public Trainer findById(int id) {
		Trainer trainer;
		try {
			trainer = jdbcTemplate.queryForObject("select * from trainer where trainer_id=?", rowMapper, new Object[] {id});
		} catch (RuntimeException ex) {
			throw new TrainerNotFoundException("Searched Data not Found.");
		}
		return trainer;
	}

	/**
	 * Update.
	 *
	 * @param trainer the trainer
	 * @return the int
	 */
	public int update(Trainer trainer) {
		int result = jdbcTemplate.update("update trainer set password=? where trainer_id=?", new Object[] { trainer.getPassword(), trainer.getTrainerId() });
		return result;
	}

}
