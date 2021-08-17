package com.cognizant.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cognizant.model.Trainer;

// TODO: Auto-generated Javadoc
/**
 * The Class TrainerRowMapper.
 */
@Component
public class TrainerRowMapper implements RowMapper<Trainer> {

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the trainer
	 * @throws SQLException the SQL exception
	 */
	@Override
	public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trainer trainer = new Trainer();
		trainer.setTrainerId(rs.getString(1));
		trainer.setPassword(rs.getString(2));
		return trainer;
	}

}
