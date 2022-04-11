package com.sbi.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbi.layer2.Account;
import com.sbi.layer2.Applicant;
@Repository
public interface ApplicantRepo {
	

	public void createApplicant(Applicant applicant);
	public void modifyApplicant(Applicant applicant);
	public List<Applicant> findAllApplicants();
	public void deleteApplicant(int applicantId);
	public Applicant findApplicant(int applicantId);
	

}
