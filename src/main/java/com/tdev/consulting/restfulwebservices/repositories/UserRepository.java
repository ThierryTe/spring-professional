package com.tdev.consulting.restfulwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdev.consulting.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
