package ru.gb.PhoneBook.view.commands;

import ru.gb.PhoneBook.view.ConsoleUI;

public class removeNumberPhone extends Command{

    public removeNumberPhone(ConsoleUI consoleUI){
        super("Удалить номер телефона", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().removeNumberPhone();
    }
}
