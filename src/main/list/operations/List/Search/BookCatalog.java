package main.list.operations.List.Search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> booksList;

    public BookCatalog(){
        this.booksList = new ArrayList<>();
    }

    public void addBook(String title, String author, int year){
        booksList.add(new Book(title, author, year));
    }

    public List<Book> searchByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();
        if (!booksList.isEmpty()){
            for (Book b : booksList){
                if (b.getBookAuthor().equalsIgnoreCase(author)){
                    booksByAuthor.add(b);
                }
            }
        } else {
            System.out.println("0 books on the catalog.");
        }
        return booksByAuthor;
    }

    public List<Book> searchByYear(int yearX, int yearY){
        List<Book> booksByYear = new ArrayList<>();
        if (!booksList.isEmpty()){
            for (Book b : booksList){
                if (b.getBookYearOfPublication() >= yearX && b.getBookYearOfPublication() <= yearY){
                    booksByYear.add(b);
                }
            }
        } else {
            System.out.println("0 books on the catalog.");
        }
        return booksByYear;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        if (!booksList.isEmpty()){
            for (Book b : booksList){
                if (b.getBookTitle().equalsIgnoreCase(title)){
                    booksByTitle.add(b);
                    break;
                }
            }
        } else {
            System.out.println("0 books on the catalog.");
        }
        return booksByTitle;
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        bookCatalog.addBook("Dez argumentos para você deletar agora suas redes sociais", "Jaron Lanier", 2018);
        bookCatalog.addBook("Sushi", "Marian Keyes", 2000);
        bookCatalog.addBook("Dexter: no escuro", "Jeff Lindsay", 2007);
        bookCatalog.addBook("Aprenda Python 3 do jeito certo", "Zedd Shaw", 2019);
        bookCatalog.addBook("Alice no país do quantum", "Robert Gilmore", 1998);

        System.out.println(bookCatalog.searchByAuthor("Marian Keyes"));
        System.out.println(bookCatalog.searchByYear(1998, 2000));
        System.out.println(bookCatalog.searchByTitle("Aprenda Python 3 do jeito certo"));

    }
}
