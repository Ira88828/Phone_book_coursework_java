package ru.gb.PhoneBook.model.service;

import ru.gb.PhoneBook.model.builder.ContactsBuilder;
import ru.gb.PhoneBook.model.contacts.Contacts;
import ru.gb.PhoneBook.model.phoneBook.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    private PhoneBook<Contacts> phoneBook;
    private ContactsBuilder contactsBuilder;
    private List<String> phoneNumbers;
    private Map<String, Contacts> contacts = new HashMap<>();

    public Service() {
        phoneBook = new PhoneBook<>();
        contactsBuilder = new ContactsBuilder();
        phoneNumbers = new ArrayList<>();
    }

    public void addContact(String name, Object phoneNumber) {
        phoneBook.addContact(name, phoneNumber);

    }

    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }

    public void removePhoneNumbers(String number) {
        phoneNumbers.remove(number);
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
        }
    }

    public void printContacts() {
        contacts.values().stream()
                .sorted((c1, c2) -> Integer.compare(c2.getPhoneNumbers().size(), c1.getPhoneNumbers().size()))
                .forEach(contact ->
                        System.out.println(contact.getName() + ": " + String.join(", ", contact.getPhoneNumbers())));
    }

}
