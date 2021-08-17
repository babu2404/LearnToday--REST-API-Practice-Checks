package com.cognizant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Course;
import com.cognizant.model.Student;
import com.cognizant.services.StudentService;


/**
 * The Class StudentController.
 */
@RestController
public class StudentController {
	
	/** The student service. */
	@Autowired
	private StudentService studentService;
	
	/**
	 * Gets the all courses.
	 *
	 * @return the all courses
	 */
	@GetMapping("/student/courses")
	public List<Course> getAllCourses() {
		return studentService.getAllCourses();
	}
	
	/**
	 * Save student.
	 *
	 * @param student the student
	 * @return the response entity
	 */
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		ResponseEntity<Student> responseEntity = new ResponseEntity<Student>(student, HttpStatus.CREATED);
		return responseEntity;
	}
	
	/**
	 * Delete student.
	 *
	 * @param id the id
	 * @return the string
	 */
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id) {
		studentService.deleteStudent(id);
		return "Data Deleted Sucessfully";
	}

}
