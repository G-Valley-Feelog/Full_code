package com.example.feelog.Repository;

import com.example.feelog.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface BoardRepository extends JpaRepository<Board, Long> {

}
=======
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}
>>>>>>> 151a19d (엔티티 클래스 추가)
