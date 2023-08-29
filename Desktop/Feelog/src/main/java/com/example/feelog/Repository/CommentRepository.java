package com.example.feelog.Repository;

import com.example.feelog.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;





@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
