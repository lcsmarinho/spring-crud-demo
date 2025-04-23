package com.example.spring_crud_demo.repository;

import com.example.spring_crud_demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório responsável por operações com a entidade Product.
 * Estende JpaRepository para ganhar métodos prontos como save(), findAll(), etc.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Podemos adicionar métodos customizados depois (ex: findByName)
}
