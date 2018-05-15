import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class Library {
    private ArrayList<Book> booklist;
    private Integer capacity;
    private HashMap<String, Integer> genres;

    public Library(){
        this.booklist = new ArrayList<>();
        this.capacity = 6;
        this.genres = new HashMap<>();
        this.genres = new HashMap<>();
        genres.put("Romance", 6);
        genres.put("Thriller", 8);
        genres.put("Crime", 10);

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


    public Object countGenre(String genre) {
        return this.genres.get(genre);
    }
}
