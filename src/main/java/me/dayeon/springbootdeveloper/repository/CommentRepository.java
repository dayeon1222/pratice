package me.dayeon.springbootdeveloper.repository;

import me.dayeon.springbootdeveloper.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
