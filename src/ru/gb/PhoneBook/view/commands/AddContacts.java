package ru.gb.PhoneBook.view.commands;

import ru.gb.PhoneBook.view.ConsoleUI;

public class AddContacts extends Command{

    public AddContacts(ConsoleUI consoleUI){
        super("Добавить контакт", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addContact();
    }
}
