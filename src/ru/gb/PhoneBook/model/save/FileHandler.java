package ru.gb.PhoneBook.model.save;

import ru.gb.PhoneBook.model.contacts.Contacts;
import ru.gb.PhoneBook.model.phoneBook.PhoneBook;

import java.io.*;

public class FileHandler implements Writable{

    public boolean saveContacts(PhoneBook  serializable, String fileName) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
                objectOutputStream.writeObject(serializable);
                return true;
            } catch (Exception e){
                //noinspection CallToPrintStackTrace
                e.printStackTrace();
                return false;
            }
        }


        public Object loadContacts(String fileName) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
                return objectInputStream.readObject();
            } catch (Exception e){
                //noinspection CallToPrintStackTrace
                e.printStackTrace();
                return null;
            }
        }
}
