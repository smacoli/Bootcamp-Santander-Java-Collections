package main.list.operations.List.Search;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookYearOfPublication;

    public Book(String bookTitle, String bookAuthor, int bookYearOfPublication){
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.bookYearOfPublication = bookYearOfPublication;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookYearOfPublication() {
        return bookYearOfPublication;
    }

    @Override
    public String toString(){
        return "Livro{" +
                "Titulo: " + bookTitle + '\'' +
                ", autor: " + bookAuthor +
                ", ano de publicacao: " + bookYearOfPublication +
                '}';
    }
}
