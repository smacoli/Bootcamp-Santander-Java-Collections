package main.set.Search;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private HashSet<Contact> myContactsInfo;

    public PhoneBook(){
        this.myContactsInfo = new HashSet<>();
    }
    public void addContact(String name, String cel){
        myContactsInfo.add(new Contact(name, cel));
    }

    public void showContacts(){
        System.out.println(myContactsInfo);
    }

    public Set<Contact> searchByName(String name){
        Set<Contact> contactsByName = new HashSet<>();
        for (Contact c : myContactsInfo){
            if (c.getName().startsWith(name)){
                contactsByName.add(c);
            }
        }
        return contactsByName;
    }

    public Contact updateContactNumber(String name, String newNumber){
        Contact updatedContact = null;
        for (Contact c : myContactsInfo){
            if (c.getName().equalsIgnoreCase(name)){
                c.setCelNumber(newNumber);
                updatedContact = c;
                break;
            }
        }
        return updatedContact;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Maria", "(37)3242-1222");
        phoneBook.addContact("Maria Joaquina", "(37)3241-1111");
        phoneBook.addContact("José Maria", "(37)3243-1442");
        phoneBook.addContact("Jorge R. R. Martin", "(37)3242-1992");

        phoneBook.showContacts();

        System.out.println(phoneBook.searchByName("Maria"));

        System.out.println("Contato atualizado com sucesso: " + phoneBook.updateContactNumber("Maria Joaquina", "(35)3521-1222"));

        phoneBook.showContacts();
    }
}
