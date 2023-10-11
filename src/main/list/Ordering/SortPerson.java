package main.list.Ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPerson {
    private List<Person> persons;
    public SortPerson(){
        this.persons = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height){
        persons.add(new Person(name, age, height));
    }

    public List<Person> sortByAge(){
        List<Person> personByAge = new ArrayList<>(persons);

        if (!persons.isEmpty()){
            Collections.sort(personByAge);
            return personByAge;
        } else {
            throw new RuntimeException("Empty list");
        }
    }

    public List<Person> sortByHeight(){
        List<Person> personByHeight = new ArrayList<>(persons);

        if (!persons.isEmpty()){
            Collections.sort(personByHeight, new Person.ComparatorByHeight());
            return personByHeight;
        } else {
            throw new RuntimeException("Empty list");
        }
    }

    public static void main(String[] args) {
        SortPerson personsOrdained = new SortPerson();

        personsOrdained.addPerson("Suzana", 28, 1.65);
        personsOrdained.addPerson("Maria", 21, 1.60);
        personsOrdained.addPerson("Bruna", 32, 1.75);
        personsOrdained.addPerson("Fernanda", 49, 1.55);
        personsOrdained.addPerson("Inácio", 15, 1.65);
        personsOrdained.addPerson("Fábio", 47, 1.85);
        personsOrdained.addPerson("Jaime", 51, 1.78);
        personsOrdained.addPerson("Alfredo", 50, 1.76);

        System.out.println("Pessoas na lista: " + personsOrdained.persons);

        System.out.println("Pessoas ordenadas por idade: " + personsOrdained.sortByAge());

        System.out.println("Pessoas ordenadas por altura: " + personsOrdained.sortByHeight());
    }
}
