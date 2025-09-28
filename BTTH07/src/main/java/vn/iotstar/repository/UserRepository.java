package vn.iotstar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.iotstar.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByUserNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String userName, String email);

	User findByUserName(String userName);
}
