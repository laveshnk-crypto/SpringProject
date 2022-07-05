package com.lavesh.socialMediaAPI.Resting.Repo;

import com.lavesh.socialMediaAPI.Resting.Entites.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepo extends JpaRepository<Author,Long> {
}
