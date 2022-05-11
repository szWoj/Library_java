import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> booksBorrowed;

    public Borrower(){
        this.booksBorrowed = new ArrayList<>();

    }

    public int bookCount(){
        return booksBorrowed.size();
    }

    public void borrowBook(Library library){
        Book book = library.removeBook();
        booksBorrowed.add(book);
    }

    public void returnBook(Book book){
        this.booksBorrowed.remove(0);
        //gotta remove a book from borrowed and add back to library
    }
}
