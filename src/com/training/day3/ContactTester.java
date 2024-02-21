package com.training.day3;

public class ContactTester {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        // Adding contacts
        phonebook.addContact(new Contact("John", "Doe", "1234567890"));
        phonebook.addContact(new Contact("Jane", "Smith", "9876543210"));

        // View all contacts
        System.out.println("All Contacts:");
        phonebook.viewAllContacts();

        // Find contact by phone number
        String phoneNumberToFind = "1234567890";
        System.out.println("\nFinding contact with phone number: " + phoneNumberToFind);
        Contact foundContact = phonebook.findContact(phoneNumberToFind);
        if (foundContact != null) {
            System.out.println("Contact found: " + foundContact);
        } else {
            System.out.println("Contact not found.");
        }

        // Removing a contact
        phonebook.removeContact(foundContact);
        System.out.println("\nAfter removing contact:");
        phonebook.viewAllContacts();
    }
}
