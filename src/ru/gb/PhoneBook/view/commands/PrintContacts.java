package ru.gb.PhoneBook.view.commands;

import ru.gb.PhoneBook.view.ConsoleUI;

public class PrintContacts extends Command{

    public PrintContacts(ConsoleUI consoleUI){
        super("Вывести текущий список контактов", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI()printContacts();
    }
}
