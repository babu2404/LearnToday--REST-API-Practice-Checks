package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.exceptions.CourseNotFoundException;
import com.cognizant.model.Course;
import com.cognizant.rowmappers.CourseRowMapper;


/**
 * The Class CoursesDao.
 */
@Component
public class CoursesDao {
	
	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/** The row mapper. */
	@Autowired
	private CourseRowMapper rowMapper;
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<Course> findAll() {
		List<Course> coursesList = jdbcTemplate.query("select * from course", rowMapper);
		return coursesList;
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the course
	 */
	public Course findById(int id) {
		Course course;
		try {
			course = jdbcTemplate.queryForObject("select * from course where courseid=?", rowMapper, id);
		}
		catch (RuntimeException ex) {
			throw new CourseNotFoundException("Searched data not found.");
		}
		return course;
	}

}
