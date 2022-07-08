package com.lavesh.socialMediaAPI.Resting.Services;

import com.lavesh.socialMediaAPI.Resting.Entites.Author;
import com.lavesh.socialMediaAPI.Resting.Entites.Book;
import com.lavesh.socialMediaAPI.Resting.Repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    // for the GET method

    public List<Author> getAuth()
    {
        return authorRepo.findAll();
    }

    // for the POST method
    public String saveAuthor(@RequestBody Author author)
    {
        authorRepo.save(author);
        return "Saved author!";
    }

    // for the PUT method
    public String updateAuthor(@PathVariable long authId, @RequestBody Author author)
    {
        Author updatedAuthor = authorRepo.findById(authId).get();
        updatedAuthor.setAuthFirstName(author.getAuthFirstName());
        updatedAuthor.setAuthLastName(author.getAuthLastName());

        authorRepo.save(updatedAuthor);
        return "Updated author!";
    }

    // for the DELETE method
    public String deleteAuthor(@PathVariable long authId)
    {
        Author deleteAuthor = authorRepo.findById(authId).get();
        authorRepo.delete(deleteAuthor);
        return "Deleted book!";
    }
}