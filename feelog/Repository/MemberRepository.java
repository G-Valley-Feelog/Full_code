package com.example.feelog.Repository;

import com.example.feelog.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import java.util.*;



@Repository

public interface MemberRepository extends JpaRepository<Member, String> {
    Optional<Member> findByEmail(String email);


}