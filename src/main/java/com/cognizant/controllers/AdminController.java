package com.cognizant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Course;
import com.cognizant.services.CourseService;


import lombok.extern.slf4j.Slf4j;


/**
 * The Class AdminController.
 */
@Slf4j
@RestController
public class AdminController {
	
	/** The course service. */
	@Autowired
	private CourseService courseService;
	
	/**
	 * Gets the all courses.
	 *
	 * @return the all courses
	 */
	@GetMapping("/admin/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	/**
	 * Gets the course by id.
	 *
	 * @param id the id
	 * @return the course by id
	 */
	@GetMapping("/admin/courses/{id}")
	public Course getCourseById(@PathVariable int id) {
		// log.info("calling courseService");
		Course courseById = courseService.getCourseById(id);
		return courseById;
	}

}
