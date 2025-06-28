package mypackage;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    void setUp() {
        contactService = new ContactService();
    }

    void testAddContact() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertEquals(contact, contactService.getContacts().get("1234567890"));
    }

   
    void testDeleteContact() {
        Contact contact = new Contact("0987654321", "Jane", "Smith", "0987654321", "456 Elm St");
        contactService.addContact(contact);
        contactService.deleteContact("0987654321");
        assertFalse(contactService.getContacts().containsKey("0987654321"));
    }

   
    void testUpdateContact() {
        Contact contact = new Contact("1112223333", "Alice", "Brown", "1112223333", "789 Oak St");
        contactService.addContact(contact);
        contactService.updateContact("1112223333", "Alicia", "Brown", "9998887777", "101 Pine St");
        
        assertEquals("Alicia", contactService.getContacts().get("1112223333").getFirstName());
        assertEquals("9998887777", contactService.getContacts().get("1112223333").getPhone());
    }

    void testUniqueContactID() {
        Contact contact1 = new Contact("5555555555", "Tom", "Johnson", "5555555555", "321 Birch St");
        Contact contact2 = new Contact("5555555555", "Sam", "Williams", "6666666666", "567 Cedar St");

        contactService.addContact(contact1);
        assertThrows(IllegalArgumentException.class, () -> contactService.addContact(contact2));
    }
}
