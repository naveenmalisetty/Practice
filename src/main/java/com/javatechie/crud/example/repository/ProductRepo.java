package com.javatechie.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.crud.example.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
