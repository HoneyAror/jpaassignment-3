package com.example.hibernateinheritance.repos;

import com.example.hibernateinheritance.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment,Integer> {
}
