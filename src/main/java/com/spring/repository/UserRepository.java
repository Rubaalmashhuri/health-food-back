package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.User;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAndPasswordAndUsertype(String email, String password, String usertype);

	@Query("SELECT u.username, u.email, u.age, u.password, u.usertype from User u")
	List<User> findUsers();

}
