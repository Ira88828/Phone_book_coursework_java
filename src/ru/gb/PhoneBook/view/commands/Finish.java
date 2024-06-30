package ru.gb.PhoneBook.view.commands;

import ru.gb.PhoneBook.view.ConsoleUI;

public class Finish extends Command{

    public Finish(ConsoleUI consoleUI){
        super("Закончить работу", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }{
}
