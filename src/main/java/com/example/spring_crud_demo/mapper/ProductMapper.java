package com.example.spring_crud_demo.mapper;

import com.example.spring_crud_demo.dto.ProductDTO;
import com.example.spring_crud_demo.model.Product;
import org.springframework.stereotype.Component;

/**
 * ProductMapper transforma Product ↔ ProductDTO.
 * Ajuda a manter as camadas desacopladas.
 */
@Component
public class ProductMapper {

    public ProductDTO toDTO(Product product) {
        return new ProductDTO(product.getId(), product.getName(), product.getPrice());
    }

    public Product toEntity(ProductDTO dto) {
        return new Product(dto.getName(), dto.getPrice());
    }

    public void updateEntity(Product entity, ProductDTO dto) {
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
    }
}
