package com.cognizant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.StudentDao;
import com.cognizant.model.Course;
import com.cognizant.model.Student;

/**
 * The Class StudentService.
 */
@Service
public class StudentService {
	
	/** The student dao. */
	@Autowired
	private StudentDao studentDao;
	
	/**
	 * Gets the all courses.
	 *
	 * @return the all courses
	 */
	public List<Course> getAllCourses() {
		return studentDao.findAll();
	}
	
	/**
	 * Save student.
	 *
	 * @param student the student
	 * @return the int
	 */
	public int saveStudent(Student student) {
		return studentDao.save(student);
	}

	/**
	 * Delete student.
	 *
	 * @param id the id
	 */
	public void deleteStudent(int id) {
		studentDao.delete(id);
	}
	
}
