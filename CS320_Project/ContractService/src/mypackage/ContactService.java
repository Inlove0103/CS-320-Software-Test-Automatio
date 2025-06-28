package mypackage;

import java.util.*;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts = new HashMap<>();
	private Object phone;
	private Object contact;
	private Object lastName;
	private Object firstName;
	private Object address;
	
	public static Contact addContact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
	
	}
	
	//Add contact with unique ID
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getContactID())) {
			throw new IllegalArgumentException("Contact ID already exist");
		}
		contacts.put(contact.getContactID(), contact);		
	}
	// Delete contact correctly
	public void deleteContact(String contactID) {
	    if (!contacts.containsKey(contactID)) {
	        throw new IllegalArgumentException("Contact ID not found");
	    }
	    contacts.remove(contactID);
	}

	// Display contacts correctly
	public void displayContacts() {
	    for (Contact contact : contacts.values()) {
	        System.out.println("ID: " + contact.getContactID() + 
	                           " | Name: " + contact.getFirstName() + " " + contact.getLastName() +
	                           " | Phone: " + contact.getPhone() +
	                           " | Address: " + contact.getAddress());
	    }
	}
}
