package com.example.storeTest.controller;

import com.example.storeTest.model.Producto;
import com.example.storeTest.repository.ProductoRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> getAllProductos(){
        return productoRepository.findAll();
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto){
        return productoRepository.save(producto);
    }

    @PutMapping("/{id_producto}")
    public Producto updateProducto(@PathVariable Long id_producto, @RequestBody Producto producto){
        Producto existingProducto = productoRepository.findById(id_producto)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con id " + id_producto));

        existingProducto.setNombre(producto.getNombre());
        existingProducto.setPrecio(producto.getPrecio());
        existingProducto.setStock(producto.getStock());
        existingProducto.setCategoria(producto.getCategoria());

        return productoRepository.save(existingProducto);
    }

    @DeleteMapping("/{id_producto}")
    public void deleteProducto(@PathVariable Long id_producto){
        productoRepository.deleteById(id_producto);
    }
}