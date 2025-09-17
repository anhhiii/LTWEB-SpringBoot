package com.example.demo.service;

import java.util.*;
import org.springframework.data.domain.*;
import com.example.demo.entity.Category;

public interface ICategoryService {
    
    Category save(Category entity);

    Optional<Category> findByCategoryName(String name);

    List<Category> findAll();

    Page<Category> findAll(Pageable pageable);

    List<Category> findAll(Sort sort);

    List<Category> findAllById(Iterable<Long> ids);

    Optional<Category> findById(Long id);

    long count();

    void deleteById(Long id);

    void delete(Category entity);

    List<Category> findByCategoryNameContaining(String name);

}
