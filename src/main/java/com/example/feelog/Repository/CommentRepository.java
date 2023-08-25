package com.example.feelog.Repository;

import com.example.feelog.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
=======
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
>>>>>>> 151a19d (엔티티 클래스 추가)
