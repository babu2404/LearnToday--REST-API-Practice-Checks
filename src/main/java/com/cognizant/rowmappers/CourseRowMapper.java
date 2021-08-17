package com.cognizant.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cognizant.model.Course;

// TODO: Auto-generated Javadoc
/**
 * The Class CourseRowMapper.
 */
@Component
public class CourseRowMapper implements RowMapper<Course> {

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the course
	 * @throws SQLException the SQL exception
	 */
	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course course = new Course();
		course.setCourseId(rs.getInt(1));
		course.setTitle(rs.getString(2));
		course.setFees(rs.getFloat(3));
		course.setDescription(rs.getString(4));
		course.setTrainer(rs.getString(5));
		course.setStartDate(rs.getDate(6));
		return course;
	}

}
