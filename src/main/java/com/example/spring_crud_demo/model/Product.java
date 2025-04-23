package com.example.spring_crud_demo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * Entidade Product representa um produto com id, nome e preço.
 * É mapeada pelo JPA para virar uma tabela no banco de dados.
 */
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único (chave primária)

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    // Construtor vazio (requerido pelo JPA)
    public Product() {
    }

    // Construtor útil para testes/criação manual
    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
