package com.example.spring_crud_demo.dto;

import java.math.BigDecimal;

/**
 * ProductDTO é o objeto usado para entrada/saída na API.
 * Ele evita expor diretamente a entidade JPA (Product).
 */
public class ProductDTO {

    private Long id;
    private String name;
    private BigDecimal price;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
