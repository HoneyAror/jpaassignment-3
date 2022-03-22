package com.example.associations.onetoone.repo;

import com.example.associations.onetoone.entities.Bookone2one;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookone2oneRepo extends JpaRepository<Bookone2one,Integer> {
}
