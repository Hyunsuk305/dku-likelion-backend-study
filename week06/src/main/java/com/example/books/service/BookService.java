package com.example.books.service;

import com.example.books.entity.Book;
import com.example.books.repository.BookRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookService {

    private final BookRepository bookRepository;

    @Transactional
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return findBook(id);
    }

    @Transactional
    public Book updateBook(Long id, Book request) {
        Book book = findBook(id);
        book.setBookName(request.getBookName());
        book.setPrice(request.getPrice());
        book.setAuthor(request.getAuthor());
        return book;
    }

    @Transactional
    public void deleteBook(Long id) {
        Book book = findBook(id);
        bookRepository.delete(book);
    }
    private Book findBook(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "책을 찾을 수 없습니다. id=" + id
                ));
    }
}