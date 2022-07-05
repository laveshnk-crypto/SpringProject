package com.lavesh.socialMediaAPI.Resting.Controller;

import com.lavesh.socialMediaAPI.Resting.Entites.Author;
import com.lavesh.socialMediaAPI.Resting.Entites.Book;
import com.lavesh.socialMediaAPI.Resting.Repo.AuthorRepo;
import com.lavesh.socialMediaAPI.Resting.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class APIController2 {

    @Autowired
    private AuthorService authorService;

    @GetMapping(value = "/author")
    public List<Author> getAuth()
    {
        return authorService.getAuth();
    }

    @PostMapping(value = "/saveAuthor")
    public String saveAuthor(@RequestBody Author author)
    {
        authorService.saveAuthor(author);
        return "Saved Author!";
    }

    @PutMapping(value = "/updateAuthor/{authId}")
    public String updateAuthor(@PathVariable long authId,@RequestBody Author author)
    {
        authorService.updateAuthor(authId,author);
        return "Updated author!";
    }

    @DeleteMapping(value = "/deleteAuthor/{authId}")
    public String deleteAuthor(@PathVariable long authId)
    {
        authorService.deleteAuthor(authId);
        return "Deleted author!";

    }
}
