package com.lavesh.socialMediaAPI.Resting.Services;

import com.lavesh.socialMediaAPI.Resting.Entites.Book;
import com.lavesh.socialMediaAPI.Resting.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    // for the GET method
    public List<Book> getBooks()
    {
        return bookRepo.findAll();
    }

    // for the POST method
    public String saveBook(@RequestBody Book book)
    {
        bookRepo.save(book);
        return "Saved book!";
    }

    // for the PUT method
    public String updateBook(@PathVariable long bookId, @RequestBody Book book)
    {
        Book updatedBook = bookRepo.findById(bookId).get();
        updatedBook.setBookName(book.getBookName());


        bookRepo.save(updatedBook);
        return "Updated book!";
    }

    // for the DELETE method
    public String deleteBook(@PathVariable long bookId)
    {
        Book deleteBook = bookRepo.findById(bookId).get();
        bookRepo.delete(deleteBook);
        return "Deleted book!";
    }


}
