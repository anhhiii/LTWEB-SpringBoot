package vn.iotstar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	List<Category> findByCateNameContainingIgnoreCase(String keyword);

	List<Category> findByUser_Id(Integer userId);

	List<Category> findByUserId(Integer userId);

}
