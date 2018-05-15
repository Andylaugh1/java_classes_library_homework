import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower("Andy");
        book = new Book();
        library = new Library();
        library.addBook(book);
    }

    @Test
    public void bagCount(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void bagEmptyAfterReturn(){
        borrower.addBook(book);
        borrower.returnBooks();
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canTakeBookFromLibrary(){
        borrower.takeBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
    }


}
