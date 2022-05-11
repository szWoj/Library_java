import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("This is Title", "This is Author", "This is Genre");

    }

    @Test
    public void beginsEmpty(){
        assertEquals(0, library.collectionCount());
    }

    @Test
    public void testAddBook(){
        library.addBook(book);
        assertEquals(1, library.collectionCount());
    }
    @Test
    public void testAddingExceedsCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.collectionCount());
    }

}
