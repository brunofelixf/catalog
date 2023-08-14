package com.devsuperior.catalog.repositories;

import com.devsuperior.catalog.entities.Product;
import com.devsuperior.catalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}