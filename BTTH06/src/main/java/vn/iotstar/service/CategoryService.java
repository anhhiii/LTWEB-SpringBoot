package vn.iotstar.service;

import java.util.List;

import vn.iotstar.entity.Category;

public interface CategoryService {
	List<Category> findAll();

	Category findById(Integer id);

	Category save(Category category);

	void deleteById(Integer id);

	List<Category> searchByName(String keyword);

	List<Category> findByUserId(Integer userId);
}
