package main.map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> phoneBookMap;

    public PhoneBook() {
        this.phoneBookMap = new HashMap<>();
    }

    public void addContact(String name, Integer celNumber){
        phoneBookMap.put(name, celNumber);
    }

    public void deleteContact(String name){
        if (!phoneBookMap.isEmpty()){
            phoneBookMap.remove(name);
        }
    }

    public void showContacts(){
        System.out.println(phoneBookMap);
    }

    public Integer searchByName(String name){
        Integer celphoneByName = null;
        if (!phoneBookMap.isEmpty()){
            celphoneByName = phoneBookMap.get(name);
        }
        return  celphoneByName;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Suzana", 11223344);
        phoneBook.addContact("Suzana", 11223344);
        phoneBook.addContact("Paula", 11223345);
        phoneBook.addContact("Rita", 11223346);
        phoneBook.addContact("Jackson", 11223347);

        phoneBook.showContacts();
        phoneBook.deleteContact("Jackson");
        phoneBook.showContacts();

    }
}
