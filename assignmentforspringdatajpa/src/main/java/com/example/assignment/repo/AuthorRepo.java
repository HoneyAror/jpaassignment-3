package com.example.assignment.repo;

import com.example.assignment.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
}
