package com.example.fibonacciapplication.repository;

import com.example.fibonacciapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
