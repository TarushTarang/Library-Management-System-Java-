class Book {
    private String title;
    private String author;
    private String bookno;
    private boolean isBorrowed;

    public Book(String title, String author, String bookno) {
        this.title = title;
        this.author = author;
        this.bookno = bookno;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (bookno: " + bookno + ")";
    }
}
