package com.example.feelog.Repository;

import com.example.feelog.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface BlogRepository extends JpaRepository<Blog, Long> {

}
=======
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

}
>>>>>>> 151a19d (엔티티 클래스 추가)
