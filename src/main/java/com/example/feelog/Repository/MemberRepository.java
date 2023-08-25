package com.example.feelog.Repository;

import com.example.feelog.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

=======
import org.springframework.stereotype.Repository;

@Repository
>>>>>>> 151a19d (엔티티 클래스 추가)
public interface MemberRepository extends JpaRepository<Member, Long> {

}