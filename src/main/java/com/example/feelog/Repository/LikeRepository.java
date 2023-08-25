package com.example.feelog.Repository;

import com.example.feelog.Entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface LikeRepository extends JpaRepository<Like, Long> {

}
=======
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

}
>>>>>>> 151a19d (엔티티 클래스 추가)
