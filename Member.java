import java.util.ArrayList;
import java.util.List;

class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            borrowedBooks.add(book);
            book.setBorrowed(true);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setBorrowed(false);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow " + book.getTitle());
        }
    }

    public void displayBorrowedBooks() {
        if (!borrowedBooks.isEmpty()) {
            System.out.println(name + " has borrowed the following books:");
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        } else {
            System.out.println(name + " has not borrowed any books.");
        }
    }
}
