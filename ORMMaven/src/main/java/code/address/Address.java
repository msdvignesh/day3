package code.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "address_table")
public class Address {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="address_id")
		private int addressId;
		
		@Column(name = "door_no")
		private String doorNo;
		
		@Column(name= "street_name")
		private String streetName;
		
		@Column(name="city")
		private String city;
		
		@Column(name="state")
		private String state;
		@Column(name= "pincode")
		private int pincode;
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getAddressId() {
			return addressId;
		}
		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}
		public String getDoorNo() {
			return doorNo;
		}
		public void setDoorNo(String doorNo) {
			this.doorNo = doorNo;
		}
		public String getStreeName() {
			return streetName;
		}
		public void setStreeName(String streeName) {
			this.streetName = streeName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "Address [addressId=" + addressId + ", doorNo=" + doorNo + ", streeName=" + streetName + ", city="
					+ city + ", state=" + state + ", pincode=" + pincode + "]";
		}
		
		
		
	
}
