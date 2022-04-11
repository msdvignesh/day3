package com.sbi.layer2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="applicant_tbl")
public class Applicant {
	@Id
	@GeneratedValue
	@Column(name="applicant_id")
	private int applicantId;
	
	@Column(name="applicant_name")
	private String applicantName;
	
	@Column(name="applicant_dob")
	private LocalDate applicantDOB;
	
	@Column(name="applicant_type")
	private String applicantType;
	
	@Column(name="applicant_father_name")
	private String applicantFatherName;
	
	@Column(name="applicant_mother_name")
	private String applicantMotherName;
	@Column(name="applicant_mobile_number")
	private String applicantMobileNumber;
	
	@OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
	List<Address> homeAddress = new ArrayList<Address>();
	
	@Column(name="aadhaar_number")
	private String aadhaarNumber;
	
	@Column(name="pan")
	private String pan;
	@Column(name="photo")
	private String photo;
	
	@Column(name = "married")
	private String married;
	
	@Column(name="applicant_occupation")
	private String occupation;
	
	@Column(name="income")
	private float annualIncome;

	private String status;
	
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public LocalDate getApplicantDOB() {
		return applicantDOB;
	}

	public void setApplicantDOB(LocalDate applicantDOB) {
		this.applicantDOB = applicantDOB;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getApplicantFatherName() {
		return applicantFatherName;
	}

	public void setApplicantFatherName(String applicantFatherName) {
		this.applicantFatherName = applicantFatherName;
	}

	public String getApplicantMotherName() {
		return applicantMotherName;
	}

	public void setApplicantMotherName(String applicantMotherName) {
		this.applicantMotherName = applicantMotherName;
	}

	public String getApplicantMobileNumber() {
		return applicantMobileNumber;
	}

	public void setApplicantMobileNumber(String applicantMobileNumber) {
		this.applicantMobileNumber = applicantMobileNumber;
	}

	public List<Address> getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(List<Address> homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public float getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(float annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	
	
	
}
