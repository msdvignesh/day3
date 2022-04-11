package com.sbi.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sbi.layer2.Applicant;
@Repository
public class ApplicantRepoImpl extends BaseDaoImpl<Applicant> implements ApplicantRepo {
	@Transactional
	public void createApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		super.persist(applicant);
	
		
	}
	@Transactional
	public void modifyApplicant(Applicant applicant) {
		// TODO Auto-generated method stub
		super.merge(applicant);
	}
	@Transactional
	public List<Applicant> findAllApplicants() {
		// TODO Auto-generated method stub
		
		
		return super.findAll("Applicant");
	}
	@Transactional
	public void deleteApplicant(int applicantId) {
		// TODO Auto-generated method stub
		super.remove(super.find(Applicant.class, applicantId));
	}
	@Transactional
	public Applicant findApplicant(int applicantId) {
		// TODO Auto-generated method stub
		return super.find(Applicant.class, applicantId);
	}

}
