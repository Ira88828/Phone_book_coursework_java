package ru.gb.PhoneBook.view;

import ru.gb.PhoneBook.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu mainMenu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        work = true;
        mainMenu = new MainMenu(this);
        presenter = new Presenter(this)
    }

    @Override
    public void start() {
        System.out.println("Доброго времени суток!");

        while (work) {
            System.out.println(mainMenu.menu());
            String choiceStr = scanner.nextLine();
            int choice = Integer.parseInt(choiceStr);
            mainMenu.execute(choice);
        }
    }

    public void addContact(){
        System.out.println("ВВедите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        Object phoneNumbers = scanner.nextLine();

        presenter.addContact(name, phoneNumbers);

    }

    private void printContacts(){
        presenter.printContacts();
    }

    private void addPhoneNumber(){
        presenter.addPhoneNumber();
    }

    private void removeContact(){
        presenter.removeContact();
    }

    private void removePhoneNumber(){
        presenter.removePhoneNumber();
    }

    private void finish(){
        work = false;
        System.out.println("Всего доброго!");
    }




    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);

    }
}
