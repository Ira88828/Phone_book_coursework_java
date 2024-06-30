package ru.gb.PhoneBook.model.builder;

import ru.gb.PhoneBook.model.contacts.Contacts;

public class ContactsBuilder {

    public Contacts build(String name, Object phoneNumbers) {
        return new Contacts(name, phoneNumbers);
    }
}
