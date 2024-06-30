package ru.gb.PhoneBook.view.commands;

import ru.gb.PhoneBook.view.ConsoleUI;

public class removeContact extends Command{

    public removeContact(ConsoleUI consoleUI){
        super("Удалить контакт", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().removeContact();
    }
}
