package com.br.example.prj.biblioteca.controllers;

import com.br.example.prj.biblioteca.models.Book;
import com.br.example.prj.biblioteca.services.impl.BookServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final BookServiceImpl bookServiceImpl;

    public LivroController(BookServiceImpl bookServiceImpl) {
        this.bookServiceImpl = bookServiceImpl;
    }
/*
    @GetMapping
    public ResponseEntity<Page<Book>> getAllBooks(Pageable pageable) {
        return new ResponseEntity<Page<Book>>(bookServiceImpl.findAll(pageable),HttpStatus.OK);
    }
*/
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<List<Book>>(bookServiceImpl.findAllBooks(),HttpStatus.OK);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable Long bookId) {
        return new ResponseEntity<>(bookServiceImpl.findById(bookId).get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createLivro(@RequestBody Book book) throws URISyntaxException {
        Book savedBook = bookServiceImpl.save(book);
        return ResponseEntity.created(new URI("/livros" + book.getBookId())).body(savedBook);
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Object> updateLivro(@PathVariable Long bookId, @RequestBody Book book) {
        Book currentBook = bookServiceImpl.findById(bookId).orElseThrow(RuntimeException::new);
        currentBook.setTitle(book.getTitle());
        currentBook.setAuthor(book.getAuthor());
        bookServiceImpl.save(currentBook);
        return ResponseEntity.ok(currentBook);
    }

    @DeleteMapping("/{bookId}")
    public ResponseEntity<Object> deleteLivro(@PathVariable Long bookId) {
        bookServiceImpl.deleteBookById(bookId);
        return ResponseEntity.ok().build();
    }
}
