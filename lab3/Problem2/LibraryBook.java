public class LibraryBook {
    public enum Genre {
        FICTION, NON_FICTION, SCIENCE, HISTORY, MYSTERY
    }

    public static final int MAX_BORROW_DAYS = 30;
    private static int totalBooksCreated = 0;

    private final String isbn;
    private final String title;

    private Genre genre;
    private boolean isBorrowed;
    private int borrowDays;

    {
        isBorrowed = false;
        borrowDays = 0;
    }

    static {
        System.out.println("Library system initialized.");
    }

    public LibraryBook(String title, String isbn, Genre genre) {
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
        totalBooksCreated++;
    }

    public void borrow() {
        borrow(MAX_BORROW_DAYS);
    }

    public void borrow(int days) {
        if (!isBorrowed) {
            this.isBorrowed = true;
            this.borrowDays = days;
            System.out.println(title + " borrowed for " + days + " days.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        isBorrowed = false;
        borrowDays = 0;
    }

    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "Book: " + title + " (" + isbn + "), Genre: " + genre;
    }


    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("1984", "978-0451524935", Genre.FICTION);
        LibraryBook book2 = new LibraryBook("Sapiens", "978-0062316097", Genre.NON_FICTION);

        System.out.println(book1);
        System.out.println("ISBN (read-only): " + book1.getIsbn());

        book1.borrow();                    // method overloading
        book2.borrow(10);                  // overloaded version

        book1.returnBook();

        System.out.println("Total books created: " + LibraryBook.getTotalBooksCreated());
    }
}