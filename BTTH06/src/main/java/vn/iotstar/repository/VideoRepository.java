package vn.iotstar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.entity.Video;

public interface VideoRepository extends JpaRepository<Video, Integer>{
	List<Video> findByTitleContainingIgnoreCase(String keyword);

    List<Video> findByUser_Id(Integer userId);
}
