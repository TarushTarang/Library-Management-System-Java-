import java.util.ArrayList;
import java.util.List;
class Librarian {
    private String name;
    private List<Book> books;

    public Librarian(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void displayBooks() {
        boolean found = false;
        System.out.println("Available books in the library:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available in the library.");
        }
    }
}