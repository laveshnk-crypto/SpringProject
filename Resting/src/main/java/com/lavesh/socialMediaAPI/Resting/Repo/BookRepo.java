package com.lavesh.socialMediaAPI.Resting.Repo;

import com.lavesh.socialMediaAPI.Resting.Entites.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
