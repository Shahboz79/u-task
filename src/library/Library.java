package library;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private static Map<Integer, Book> library = new HashMap<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        addBook("Java Programming");
        addBook("Computer Programming");
        addBook("The Programmatic Programmer");

        getAllBooks();
        getBookById(2);
        deleteBook(1);
        getAllBooks();
    }

    public static void addBook(String title) {
        Book book = new Book(nextId++, title);
        library.put(book.id, book);
        System.out.println("Added " + book);
    }

    public static void getAllBooks() {
        System.out.println("All Books:");
        for (Book book : library.values()) {
            System.out.println(book);
        }
    }

    public static void getBookById(int id) {
        Book book = library.get(id);
        System.out.println(book != null ? "Found: " + book : "Book not found");
    }

    public static void deleteBook(int id) {
        if (library.remove(id) != null) {
            System.out.println("Book deleted : " + id);
        } else {
            System.out.println("Book not found");
        }
    }
}
