package com.example.associations.onetomany.repos;

import com.example.associations.onetomany.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
}
