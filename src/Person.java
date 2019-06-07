
public class Person {


	private String firstName;
	private String lastName;
	private String ssNumber;
	private String phoneNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsNumber() {
		return ssNumber;
	}
	public void setSsNumber(String ssNumber) {
		this.ssNumber = ssNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// Comment Please some more comments
	// Comre comments 
	public Person(String firstName, String lastName, String ssNumber, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssNumber = ssNumber;
		this.phoneNumber = phoneNumber;
	}
	
}
