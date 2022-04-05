package code.passport;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "passport_table")
public class Passport {
	
	
			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)
			@Column(name="passport_id")
			private int passportId;
			
			@Column(name = "passport_no")
			private String passportNo;
			
			@Column(name= "passport_Issued_By")
			private String passportIssuedBy;
			
			@Column(name="passport_issue_date")
			private LocalDate passportIssuedDate;

			public Passport() {
				super();
				// TODO Auto-generated constructor stub
			}

			public int getPassportId() {
				return passportId;
			}

			public void setPassportId(int passportId) {
				this.passportId = passportId;
			}

			public String getPassportNo() {
				return passportNo;
			}

			public void setPassportNo(String passportNo) {
				this.passportNo = passportNo;
			}

			public String getPassportIssuedBy() {
				return passportIssuedBy;
			}

			public void setPassportIssuedBy(String passportIssuedBy) {
				this.passportIssuedBy = passportIssuedBy;
			}

			public LocalDate getPassportIssuedDate() {
				return passportIssuedDate;
			}

			public void setPassportIssuedDate(LocalDate passportIssuedDate) {
				this.passportIssuedDate = passportIssuedDate;
			}
			
			
			
}