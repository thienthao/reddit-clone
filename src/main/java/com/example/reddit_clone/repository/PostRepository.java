package com.example.reddit_clone.repository;

import com.example.reddit_clone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
