import java.util.ArrayList;
import java.util.List;


class Library {
    List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        this.books.add(book);
    }
}