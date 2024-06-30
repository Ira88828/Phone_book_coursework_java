package ru.gb.PhoneBook.model.phoneBook;

import ru.gb.PhoneBook.model.contacts.Contacts;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook<C> implements Serializable {
    private Map<String, Contacts> contacts = new HashMap<>();
    private String fileName;

    public PhoneBook() {
        this.contacts = contacts;
        this.fileName = fileName;
    }

    public void addContact(String name, Object phoneNumbers) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new Contacts(name, phoneNumbers));
        }
    }

    public void addPhoneNumber(String name, String number) {
        Contacts contact = contacts.get(name);
        if (contact != null) {
            contact.addPhoneNumber(number);
        }
    }

    public Map<String, Contacts> getContacts() {
        return contacts;
    }

    public void removePhoneNumber(String name, String number) {
        Contacts contact = contacts.get(name);
        if (contact != null) {
            contact.removePhoneNumbers(number);
        }
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
        }
    }

    public String printContacts() {
        contacts.values().stream()
                .sorted((c1, c2) -> Integer.compare(c2.getPhoneNumbers().size(), c1.getPhoneNumbers().size()))
                .forEach(contact ->
                        System.out.println(contact.getName() + ": " + String.join(", ", contact.getPhoneNumbers())));
        return toString();
    }
}

    
