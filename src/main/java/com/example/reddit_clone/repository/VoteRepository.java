package com.example.reddit_clone.repository;

import com.example.reddit_clone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
