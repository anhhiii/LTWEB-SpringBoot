package com.example.demo.controller.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Category;
import com.example.demo.model.Response;
import com.example.demo.service.ICategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryAPIController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<Response> getAll() {
        return new ResponseEntity<Response>(
            new Response(true, "Danh sách Category", categoryService.findAll()),
            HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getById(@PathVariable Long id) {
        Optional<Category> category = categoryService.findById(id);
        if (category.isPresent()) {
            return new ResponseEntity<Response>(
                new Response(true, "Tìm thấy", category.get()),
                HttpStatus.OK
            );
        } else {
            return new ResponseEntity<Response>(
                new Response(false, "Không tìm thấy", null),
                HttpStatus.NOT_FOUND
            );
        }
    }

    @PostMapping
    public ResponseEntity<Response> create(@RequestBody Category category) {
        Category saved = categoryService.save(category);
        return new ResponseEntity<Response>(
            new Response(true, "Thêm thành công", saved),
            HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response> update(@PathVariable Long id, @RequestBody Category category) {
        Optional<Category> opt = categoryService.findById(id);
        if (opt.isPresent()) {
            category.setCategoryId(id);
            Category updated = categoryService.save(category);
            return new ResponseEntity<Response>(
                new Response(true, "Cập nhật thành công", updated),
                HttpStatus.OK
            );
        }
        return new ResponseEntity<Response>(
            new Response(false, "Không tìm thấy Category", null),
            HttpStatus.NOT_FOUND
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> delete(@PathVariable Long id) {
        Optional<Category> opt = categoryService.findById(id);
        if (opt.isPresent()) {
            categoryService.deleteById(id);
            return new ResponseEntity<Response>(
                new Response(true, "Xóa thành công", opt.get()),
                HttpStatus.OK
            );
        }
        return new ResponseEntity<Response>(
            new Response(false, "Không tìm thấy Category", null),
            HttpStatus.NOT_FOUND
        );
    }
}
