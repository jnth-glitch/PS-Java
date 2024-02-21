package com.training.day3;
import java.util.*;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

        public Contact findContact(String phoneNo) {
        for (Contact c : contacts) {
            if (c.getPhoneNo().equals(phoneNo)) {
                return c;
            }
        }
        return null;
    }

    public void viewAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}

