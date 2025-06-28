package test;

import mypackage.ContactService;

public class ContactTest {

	@Test
	
	public static void main(String[] args) {
		ContactService service = new ContactService();
		
		//Add Contacts
		service.addContact(new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St"));
		service.addContact(new Contact("0987654321",  "Jane", "Smith", "0987654321", "456 Elm St"));
		
		//Update a contact
		service.updateContact("1234567890", "Johnny", "Doe", "111222333", "789 Oak St");
		
		//Delete a contact
		service.deleteContact("0987654321");
		
		//Display all contacts
		service.displayContacts();
	}
}
