import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sbi.layer2.AccountType;
import com.sbi.layer2.Address;
import com.sbi.layer2.Applicant;
import com.sbi.layer2.ApplicantStatus;
import com.sbi.layer3.ApplicantRepo;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:myspring.xml")
public class ApplicantRepoTest {
	@Autowired
	ApplicantRepo applicantRepo;
	
	@Test
	public void createApplicant() {
		Applicant applicant = new Applicant();
		
		Address tempAddress = new Address();
		tempAddress.setAddressType("TEMPORARY");
		tempAddress.setArea("SAIBABA COLONY");
		tempAddress.setCity("COIMBATORE");
		tempAddress.setCountry("INDIA");
		tempAddress.setPin(641003);
		tempAddress.setState("TAMIL NADU");
		tempAddress.setStreet("2nd STREET");
		tempAddress.setApplicant(applicant);
		
		Address permanentAddress = new Address();
		permanentAddress.setAddressType("PERMANENT");
		permanentAddress.setArea("SAIBABA COLONY");
		permanentAddress.setCity("COIMBATORE");
		permanentAddress.setCountry("INDIA");
		permanentAddress.setPin(641003);
		permanentAddress.setState("TAMIL NADU");
		permanentAddress.setStreet("2nd STREET");
		permanentAddress.setApplicant(applicant);
		
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(tempAddress);
		addressList.add(permanentAddress);
		
		
		applicant.setApplicantName("Applicant Name 1 ");
		applicant.setApplicantFatherName("FATHER NAME 1");
		applicant.setApplicantType(AccountType.SAVINGS);
		applicant.setApplicantMotherName("MOTHER NAME 1");
		applicant.setApplicantDOB(LocalDate.of(2000, 8, 05));
		applicant.setHomeAddress(addressList);
		
		applicant.setStatus(ApplicantStatus.APPLIED);
		applicant.setAadhaarNumber("123432141234");
		applicant.setAnnualIncome(100000);
		applicant.setApplicantMobileNumber("9874561234");
		applicant.setOccupation("BANKING");
		applicant.setPan("AAAAA1234A");
		applicant.setPhoto("PHOTO1.jpg");
		applicant.setMarried("MARRIED");
		
		applicantRepo.createApplicant(applicant);
		
		
	}
	
	

}
