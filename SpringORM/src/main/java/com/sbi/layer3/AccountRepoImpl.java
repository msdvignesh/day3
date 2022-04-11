package com.sbi.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sbi.layer2.Account;
@Repository
public class AccountRepoImpl extends BaseDaoImpl implements AccountRepo {
	@Transactional
	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		super.persist(account);
		
	}
	@Transactional
	public void modifyAccount(Account account) {
		// TODO Auto-generated method stub
		super.merge(account);
	}
	@Transactional
	public List<Account> findAllAccounts() {
		// TODO Auto-generated method stub
		return super.findAll("Account");
	}
	@Transactional
	public void deleteAccount(int accountNo) {
		// TODO Auto-generated method stub
		Account account = (Account) super.find(Account.class, accountNo);
		super.remove(account);
		
	}
	@Transactional
	public Account findAccount(int accountNo) {
		// TODO Auto-generated method stub
		return (Account) super.find(Account.class, accountNo);
	}

	
	

}
