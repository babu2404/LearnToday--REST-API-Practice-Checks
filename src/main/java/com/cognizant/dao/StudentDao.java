package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.exceptions.EnrollmentNotFoundException;
import com.cognizant.model.Course;
import com.cognizant.model.Student;
import com.cognizant.rowmappers.CourseRowMapper;


/**
 * The Class StudentDao.
 */
@Component
public class StudentDao {
	
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
		List<Course> coursesList = jdbcTemplate.query("select * from course order by startdate asc", rowMapper);
		return coursesList;
	}
	
	/**
	 * Save.
	 *
	 * @param student the student
	 * @return the int
	 */
	public int save(Student student) {
		int result = jdbcTemplate.update("insert into student (enrollment_id, student_id, course_id) values (?, ?, ?)", new Object[] { student.getEnrollmentId(), student.getStudentId(), student.getCourseId() });
		return result;
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(int id) {
		int result = jdbcTemplate.update("delete from student where student_id=?", new Object[] { id });
		if(result == 0) {
			throw new EnrollmentNotFoundException("No Enrollment Information Found");
		}
	}

}
