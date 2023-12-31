package com.example.feelog.Repository;

import com.example.feelog.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;



@NoRepositoryBean
@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}

