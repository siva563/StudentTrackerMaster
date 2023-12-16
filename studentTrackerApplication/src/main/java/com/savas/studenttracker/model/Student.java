package com.savas.studenttracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Student {
	@Id
	@GeneratedValue

	// Personal Details

	private Long id;

	private String firstname;
	private String lastname;
	private String email;
	private String mobile;
	private String surname;
	private String bloodGroup;

	// Student Emergency Details

	private String emergencyName;
	private String emergencyrealtionship;
	private String emergencyContactMobile;

	// Qualification Details

	private String highestQulification;
	private String highestQulificationPercentage;
	private String university;
	private String college;
	private String intermedidateCollegeName;
	private String interPercentage;
	private String interGroup;
	private String sscSchoolName;
	private String sscPercentage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmergencyName() {
		return emergencyName;
	}

	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}

	public String getEmergencyrealtionship() {
		return emergencyrealtionship;
	}

	public void setEmergencyrealtionship(String emergencyrealtionship) {
		this.emergencyrealtionship = emergencyrealtionship;
	}

	public String getEmergencyContactMobile() {
		return emergencyContactMobile;
	}

	public void setEmergencyContactMobile(String emergencyContactMobile) {
		this.emergencyContactMobile = emergencyContactMobile;
	}

	public String getHighestQulification() {
		return highestQulification;
	}

	public void setHighestQulification(String highestQulification) {
		this.highestQulification = highestQulification;
	}

	public String getHighestQulificationPercentage() {
		return highestQulificationPercentage;
	}

	public void setHighestQulificationPercentage(String highestQulificationPercentage) {
		this.highestQulificationPercentage = highestQulificationPercentage;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getIntermedidateCollegeName() {
		return intermedidateCollegeName;
	}

	public void setIntermedidateCollegeName(String intermedidateCollegeName) {
		this.intermedidateCollegeName = intermedidateCollegeName;
	}

	public String getInterPercentage() {
		return interPercentage;
	}

	public void setInterPercentage(String interPercentage) {
		this.interPercentage = interPercentage;
	}

	public String getInterGroup() {
		return interGroup;
	}

	public void setInterGroup(String interGroup) {
		this.interGroup = interGroup;
	}

	public String getSscSchoolName() {
		return sscSchoolName;
	}

	public void setSscSchoolName(String sscSchoolName) {
		this.sscSchoolName = sscSchoolName;
	}

	public String getSscPercentage() {
		return sscPercentage;
	}

	public void setSscPercentage(String sscPercentage) {
		this.sscPercentage = sscPercentage;
	}

}
