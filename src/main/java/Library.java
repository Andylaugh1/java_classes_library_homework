import java.util.ArrayList;

public class Library {
    private ArrayList<Book> booklist;
    private Integer capacity;

    public Library(){
        this.booklist = new ArrayList<>();
        this.capacity = 6;
    }

    public int bookCount() {
        return this.booklist.size();
    }

    public void addBook(Book book) {
        this.booklist.add(book);
    }

    public void checkStockAddBook(Book book) {
        if(this.bookCount() < this.capacity);
        this.addBook(book);
    }

    public Book removeBook() {
        return this.booklist.remove(0);
    }
}
