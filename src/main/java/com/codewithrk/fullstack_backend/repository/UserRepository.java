package com.codewithrk.fullstack_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithrk.fullstack_backend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsername(String username);
}