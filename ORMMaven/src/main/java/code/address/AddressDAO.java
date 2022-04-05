package code.address;

import java.util.List;

public interface AddressDAO {

	
		public void createAddress(Address address);
		public void updateAddress(Address address);
		public void deleteAddress(int addressId);
		public Address findAddress(int addressId);
		public List findAllAddress();


}
