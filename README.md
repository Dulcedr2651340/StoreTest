# Proyecto de Prueba Técnica

Este proyecto es una implementación de una API REST utilizando **Spring Boot** con **JPA** y **MySQL**. La prueba técnica tiene como objetivo demostrar mis habilidades en el desarrollo de aplicaciones backend con **Spring Boot**, la implementación de **endpoints REST** y el manejo de bases de datos relacionales utilizando **JPA**.


![image](https://github.com/user-attachments/assets/34b1a0f3-3643-46af-a5a7-3c0ce1f4afdd)


## Funcionalidades

El proyecto incluye las siguientes funcionalidades:

### Categorías
- **GET** `/categorias`: Listar todas las categorías disponibles.
- **POST** `/categorias`: Crear una nueva categoría.
- **PUT** `/categorias/{id_categoria}`: Actualizar una categoría existente.
- **DELETE** `/categorias/{id_categoria}`: Eliminar una categoría.

### Productos
- **GET** `/productos`: Listar todos los productos.
- **POST** `/productos`: Crear un nuevo producto (requiere asociar una categoría).
- **PUT** `/productos/{id_producto}`: Actualizar un producto existente.
- **DELETE** `/productos/{id_producto}`: Eliminar un producto.

## Requisitos

1. **Java 17** o superior.
2. **MySQL** como base de datos relacional.
3. **Spring Boot** para la creación de la API REST.

## Instalación

1. Clona este repositorio en tu máquina local:
   ```bash
      https://github.com/Dulcedr2651340/StoreTest.git
