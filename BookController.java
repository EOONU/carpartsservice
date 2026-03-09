package com.example.lab5partb;



import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {


    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Swagger'da: GET /books/all
    @GetMapping("/all")
    public List<book> getAll() {
        return bookService.getAllBooks();
    }

    // Swagger'da: POST /books/add  --> burada JSON yazabileceksin
    @PostMapping("/add")
    public book add(@Valid @RequestBody book book) {
        return bookService.addBook(book);
    }
}
