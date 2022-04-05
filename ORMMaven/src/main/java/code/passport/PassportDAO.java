package code.passport;


import java.util.List;

public interface PassportDAO {

	
		public void createPassport(Passport passport);
		public void updatePassport(Passport passport);
		public void deletePassport(int passportId);
		public Passport findPassport(int passportId);
		public List findAllPassport();


}
