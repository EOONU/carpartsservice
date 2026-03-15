package service;




import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final List<book> books = new ArrayList<>();
    private long nextId = 1;

    public book addBook(book book) {
        book.setId(nextId++);
        books.add(book);
        return book;
    }

    public List<book> getAllBooks() {
        return books;
    }
}