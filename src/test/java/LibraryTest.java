import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void bookCount(){
    assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canCheckStockAddBook(){
        library.checkStockAddBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canGetBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canCountGenre(){
        assertEquals(6, library.countGenre("Romance"));
    }

}
