import java.util.*;

class Book {
    private String bookTitle;
    private String bookAuthor;

    public Book(String title, String author) {
        this.bookTitle = title;
        this.bookAuthor = author;
    }

    public String getDetails() {
        return bookTitle + " by " + bookAuthor;
    }
}

class Library {
    private String libraryName;
    private List<Book> bookList = new ArrayList<>();

    public Library(String name) { 
        this.libraryName = name; 
    }

    public void addBook(Book book) { 
        bookList.add(book); 
    }

    public void showBooks() {
        System.out.println("Library: " + libraryName);
        for (Book b : bookList) 
            System.out.println(" - " + b.getDetails());
    }
}

public class LibraryAggregationDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "James");
        Book book2 = new Book("OOP in Java", "Robert");

        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);
        collegeLibrary.addBook(book2); // same book in multiple libraries

        cityLibrary.showBooks();
        collegeLibrary.showBooks();
    }
}
