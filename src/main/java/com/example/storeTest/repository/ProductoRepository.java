package com.example.storeTest.repository;

import com.example.storeTest.model.Categoria;
import com.example.storeTest.model.Producto;
import lombok.extern.java.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
