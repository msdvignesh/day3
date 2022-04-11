import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sbi.layer2.Account;
import com.sbi.layer3.AccountRepoImpl;
import com.sbi.layer3.ApplicantRepoImpl;
import com.sbi.layer4.AccountServiceImpl;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:myspring.xml")
public class AccountTest {
	
	@Autowired
	AccountRepoImpl accountRepo;
	
	@Autowired
	AccountServiceImpl accountService;
	
	@Autowired
	ApplicantRepoImpl  applicantRepo;
	
	@Test
	public void createAccount() {
		
		
		Account account = new Account();
		account.setAccountNo(12345653);
		account.setAccountName("Account Number 1");
		account.setAccountBalance(5000);
		
		accountRepo.createAccount(account);
	}
	
	@Test
	public void openAccountTest() {
		
		accountService.openAccount(27);
		
	}

}
