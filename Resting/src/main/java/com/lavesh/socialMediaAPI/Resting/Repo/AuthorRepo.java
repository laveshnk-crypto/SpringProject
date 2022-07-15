package com.lavesh.socialMediaAPI.Resting.Repo;

import com.lavesh.socialMediaAPI.Resting.Entites.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Long> {
}
