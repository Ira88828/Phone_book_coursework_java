package ru.gb.PhoneBook.presenter;

import ru.gb.PhoneBook.model.phoneBook.PhoneBook;
import ru.gb.PhoneBook.view.View;

public class Presenter {
    private View view;
    private PhoneBook book;

public Presenter(View view)   {
    this.view = view;
    book = new PhoneBook();
}

public void addContact(String name, Object phoneNumbers){
    book.addContact(name, phoneNumbers);
    printContacts();
}

public void printContacts(){
    String answer = book.printContacts();
    view.printAnswer(answer);
}

public void addPhoneNumber(String name, String number){
    book.addPhoneNumber(name, number);
    printContacts();
}

public void removeContact(String name){
    book.removeContact(name);
    printContacts();
}

public void removePhoneNumber(String name, String number){
    book.removePhoneNumber(name, number);
    printContacts();
}

}
