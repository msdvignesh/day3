package com.sbi.layer4;

import org.springframework.stereotype.Repository;

import com.sbi.layer2.Account;

@Repository
public interface AccountService {

	public void openAccount(int applicationId);
	
}
