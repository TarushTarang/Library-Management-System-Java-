public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating a librarian
        Librarian librarian = new Librarian("Laura");

        // Adding books to the library
        Book book1 = new Book("Atomic Habits", "James Clear", "1234567890");
        Book book2 = new Book("Looking for Alaska", "John Green", "0987654321");
        Book book3 = new Book("The Alchemist", "Paulo Coelho", "1122334455");

        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addBook(book3);

        // Displaying available books
        librarian.displayBooks();

        // Creating a member
        Member member = new Member("Harsh", "M001");

        // Member borrows a book
        member.borrowBook(book1);

        // Displaying available books after borrowing
        librarian.displayBooks();

        // Displaying borrowed books by the member
        member.displayBorrowedBooks();

        // Member returns a book
        member.returnBook(book1);

        // Displaying available books after returning
        librarian.displayBooks();

        // Displaying borrowed books by the member
        member.displayBorrowedBooks();
    }
}
