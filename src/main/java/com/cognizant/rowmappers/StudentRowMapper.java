package com.cognizant.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.model.Student;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentRowMapper.
 */
public class StudentRowMapper implements RowMapper<Student> {

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the student
	 * @throws SQLException the SQL exception
	 */
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setEnrollmentId(rs.getInt(1));
		student.setStudentId(rs.getInt(2));
		student.setCourseId(rs.getInt(3));
		return student;
	}

}
