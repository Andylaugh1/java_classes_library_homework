import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> bag;

    public Borrower(String name) {
        this.name = name;
        this.bag = new ArrayList<>();
    }

    public int bookCount() {
        return this.bag.size();
    }


    public void addBook(Book book) {
        this.bag.add(book);
    }

    public void returnBooks() {
        this.bag.clear();
    }

    public void takeBookFromLibrary(Library library){
        Book book = library.removeBook();
        this.addBook(book);
    }
}
