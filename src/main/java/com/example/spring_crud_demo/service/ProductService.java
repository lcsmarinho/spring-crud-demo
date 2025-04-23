package com.example.spring_crud_demo.service;

import com.example.spring_crud_demo.dto.ProductDTO;
import com.example.spring_crud_demo.mapper.ProductMapper;
import com.example.spring_crud_demo.model.Product;
import com.example.spring_crud_demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Camada de serviço com regras de negócio.
 */
@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ProductDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public Optional<ProductDTO> findById(Long id) {
        return repository.findById(id).map(mapper::toDTO);
    }

    public ProductDTO save(ProductDTO dto) {
        Product entity = mapper.toEntity(dto);
        return mapper.toDTO(repository.save(entity));
    }

    public Optional<ProductDTO> update(Long id, ProductDTO dto) {
        return repository.findById(id)
                .map(existing -> {
                    mapper.updateEntity(existing, dto);
                    return mapper.toDTO(repository.save(existing));
                });
    }

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
