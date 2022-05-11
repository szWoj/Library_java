import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("First Title", "Mark Mark", "Crime");
        borrower = new Borrower();


    }

    @Test
    public void beginsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void ableToAddBookToBorrowed(){
        assertEquals(0, library.collectionCount());
        assertEquals(0, borrower.bookCount());
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.collectionCount());
        assertEquals(0, borrower.bookCount());
        borrower.borrowBook(library);
        assertEquals(1, library.collectionCount());
        assertEquals(1, borrower.bookCount());

    }



}
