package com.example.storeTest.controller;

import com.example.storeTest.model.Categoria;
import com.example.storeTest.repository.CategoriaRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> getAllCategorias(){
        return categoriaRepository.findAll();
    }

    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    @PutMapping("/{id_categoria}")
    public Categoria updateCategoria(@PathVariable Long id_categoria, @RequestBody Categoria categoria){
        Categoria existingCategoria = categoriaRepository.findById(id_categoria)
                .orElseThrow(() -> new RuntimeException("Categoria no encontrada con id " + id_categoria));

        existingCategoria.setNombre(categoria.getNombre());
        existingCategoria.setDescripcion(categoria.getDescripcion());

        return categoriaRepository.save(existingCategoria);
    }

    @DeleteMapping("/{id_categoria}")
    public void deleteCategoria(@PathVariable Long id_categoria){
        categoriaRepository.deleteById(id_categoria);
    }
}