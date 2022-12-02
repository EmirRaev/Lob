package com.example.Lib.dao;

import com.example.Lib.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository  extends JpaRepository<Comments, Long> {
}
