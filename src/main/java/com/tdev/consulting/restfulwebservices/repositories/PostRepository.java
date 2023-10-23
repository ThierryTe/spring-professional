package com.tdev.consulting.restfulwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdev.consulting.restfulwebservices.user.Post;

public interface PostRepository  extends JpaRepository<Post, Integer>{

}
