package com.techi.Users.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.techi.Users.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
