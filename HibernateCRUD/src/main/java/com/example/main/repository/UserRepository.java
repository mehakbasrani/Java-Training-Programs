package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.main.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
