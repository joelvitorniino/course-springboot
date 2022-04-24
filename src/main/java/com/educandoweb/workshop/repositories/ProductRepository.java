package com.educandoweb.workshop.repositories;

import com.educandoweb.workshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}