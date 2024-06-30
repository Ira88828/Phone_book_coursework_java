package ru.gb.PhoneBook.model.contacts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contacts implements Serializable {
    private String name;
    private List<String> phoneNumbers;

    public Contacts(String name, Object phoneNumbers) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
    }

    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    public void removePhoneNumbers(String number) {
        phoneNumbers.remove(number);
    }

}
