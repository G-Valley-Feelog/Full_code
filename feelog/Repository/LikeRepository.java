package com.example.feelog.Repository;

import com.example.feelog.Entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;



@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

}
