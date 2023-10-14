package main.set.Search;

import java.util.Objects;

public class Contact {
    private String name;
    private String celNumber;

    public Contact(String name, String celNumber){
        this.name = name;
        this.celNumber = celNumber;
    }

    public String getName() {
        return name;
    }

    public String getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(String celNumber) {
        this.celNumber = celNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getName(), contact.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", celNumber='" + celNumber + '\'' +
                '}';
    }
}
