package com.helendong.PantryPanda.repository;

import com.helendong.PantryPanda.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> { // Assume User's ID is Integer

    Optional<User> findById(Integer id);

    Optional<User> findByUsername(String username);

    Optional<Long> findIdByUsername(String username);
}
