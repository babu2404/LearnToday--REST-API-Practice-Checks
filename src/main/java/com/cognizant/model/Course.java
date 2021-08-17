package com.cognizant.model;

import java.util.Date;


/**
 * The Class Course.
 */
public class Course {

	/** The course id. */
	private int courseId;
	
	/** The title. */
	private String title;
	
	/** The fees. */
	private float fees;
	
	/** The description. */
	private String description;
	
	/** The trainer. */
	private String trainer;
	
	/** The start date. */
	private Date startDate;

	/**
	 * Gets the course id.
	 *
	 * @return the course id
	 */
	public int getCourseId() {
		return courseId;
	}

	/**
	 * Sets the course id.
	 *
	 * @param courseId the new course id
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the fees.
	 *
	 * @return the fees
	 */
	public float getFees() {
		return fees;
	}

	/**
	 * Sets the fees.
	 *
	 * @param fees the new fees
	 */
	public void setFees(float fees) {
		this.fees = fees;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the trainer.
	 *
	 * @return the trainer
	 */
	public String getTrainer() {
		return trainer;
	}

	/**
	 * Sets the trainer.
	 *
	 * @param trainer the new trainer
	 */
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	/**
	 * Gets the start date.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
