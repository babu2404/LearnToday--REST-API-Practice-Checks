package com.cognizant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.CoursesDao;
import com.cognizant.model.Course;

import lombok.extern.slf4j.Slf4j;


/**
 * The Class CourseService.
 */
@Slf4j
@Service
public class CourseService {
	
	/** The course dao. */
	@Autowired
	private CoursesDao courseDao;
	
	/**
	 * Gets the all courses.
	 *
	 * @return the all courses
	 */
	public List<Course> getAllCourses() {
		//log.info("finding all courses");
		return courseDao.findAll();
	}

	/**
	 * Gets the course by id.
	 *
	 * @param id the id
	 * @return the course by id
	 */
	public Course getCourseById(int id) {
		//log.info("finding  courses by ID");
		return courseDao.findById(id);
	}

}
