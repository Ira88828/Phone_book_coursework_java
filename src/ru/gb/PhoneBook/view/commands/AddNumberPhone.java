package ru.gb.PhoneBook.view.commands;

import ru.gb.PhoneBook.view.ConsoleUI;

public class AddNumberPhone extends Command{

    public AddNumberPhone(ConsoleUI consoleUI){
        super("Добавить номер телефона к контакту", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addPhoneNumber();
    }
}
