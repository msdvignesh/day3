package com.sbi.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbi.layer2.Account;

@Repository
public interface AccountRepo {

	public void createAccount(Account account);
	public void modifyAccount(Account account);
	public List<Account> findAllAccounts();
	public void deleteAccount(int accountNo);
	public Account findAccount(int accountNo);
	
}
