import library.Book;

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Head First Java", "Kathy Sierra", 650.0);
        b1.display();
    }
}

/*
 * To compile and run (from inside the Assignment12 folder):
 *   javac library/Book.java LibraryDemo.java
 *   java LibraryDemo
 */
