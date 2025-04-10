package com.example.storeTest.repository;

import com.example.storeTest.model.Categoria;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}