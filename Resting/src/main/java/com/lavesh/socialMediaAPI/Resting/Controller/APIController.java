package com.lavesh.socialMediaAPI.Resting.Controller;

import com.lavesh.socialMediaAPI.Resting.Entites.Book;
import com.lavesh.socialMediaAPI.Resting.Entites.Book;
import com.lavesh.socialMediaAPI.Resting.Repo.AuthorRepo;
import com.lavesh.socialMediaAPI.Resting.Repo.BookRepo;

import com.lavesh.socialMediaAPI.Resting.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/books")
public class APIController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/book")
    public List<Book>getBook()
    {
        return bookService.getBooks();
    }

    @PostMapping(value = "/saveBook")
    public String saveBook(@RequestBody Book book)
    {
        bookService.saveBook(book);
        return "Saved book!";
    }

    @PutMapping(value = "/updateBook/{bookId}")
    public String updateBook(@PathVariable long bookId,@RequestBody Book book)
    {
        bookService.updateBook(bookId,book);
        return "Updated book!";
    }

    @DeleteMapping(value = "/deleteBook/{bookId}")
    public String deleteBook(@PathVariable long bookId)
    {
        bookService.deleteBook(bookId);
        return "Deleted book!";

    }
    }




