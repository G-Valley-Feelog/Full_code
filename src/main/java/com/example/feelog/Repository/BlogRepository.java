package com.example.feelog.Repository;

import com.example.feelog.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {

}
