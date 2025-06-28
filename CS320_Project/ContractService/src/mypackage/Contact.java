package mypackage;

public class Contact {
	private String contactID;
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String address;
	
	Contact(contactId);
	firstNameCheck(firstName);
	lastNameCheck(lastName);
	addressCheck(address);
	
	//assign variables
	this.contactId = contactId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneCheck(phoneNumber);
	this.address = address;
}
		
	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		if (contactId == null || contactId.length() > 10) throw new IllegalArgumentException("Invalid Contact Id");
		if (firstName == null || firstName.length () > 10) throw new IllegalArgumentException("Invalid First Name");
		if (lastName == null | lastName.length() >10) throw new IllegalArgumentException("Invalid Last Name");
		if (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) throw new IllegalArgumentException("Invaolid Phone Number");
		if (address == null || address.length() > 30) throw new IllegalArgumentException("Invalid Adress");
	}
		
}