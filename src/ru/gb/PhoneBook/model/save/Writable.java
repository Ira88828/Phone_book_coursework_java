package ru.gb.PhoneBook.model.save;

import ru.gb.PhoneBook.model.phoneBook.PhoneBook;

public interface Writable {
    boolean saveContacts(PhoneBook<C> serializable, String fileName);
    Object loadContacts(String fileName);
}
