package com.example.associations.manytomany;

import org.springframework.data.repository.CrudRepository;

public interface AuthormanytomanyRepo extends CrudRepository<Authormanytomany,Integer> {
    Authormanytomany findAllById(int i);
}
