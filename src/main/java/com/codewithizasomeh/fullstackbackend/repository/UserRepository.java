package com.codewithizasomeh.fullstackbackend.repository;

import com.codewithizasomeh.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
