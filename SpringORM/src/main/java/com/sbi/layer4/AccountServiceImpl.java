package com.sbi.layer4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.layer2.Account;
import com.sbi.layer2.Applicant;
import com.sbi.layer2.ApplicantStatus;
import com.sbi.layer3.AccountRepo;
import com.sbi.layer3.ApplicantRepo;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	ApplicantRepo applicantRepo;
	
	@Autowired
	AccountRepo accountRepo;
	
	public void openAccount(int applicationId) {
		Applicant applicant = applicantRepo.findApplicant(applicationId) ;
		
		Account account = new Account();
		applicant.setStatus(ApplicantStatus.APPROVED);
		account.setAccountName(applicant.getApplicantName());
		account.setAccountBalance(10000);
		account.setApplicant(applicant);
		applicantRepo.modifyApplicant(applicant);
		accountRepo.createAccount(account);
		System.out.println("Account created");
		
	}

}
