package com.example.feelog.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import lombok.*;

@Entity
@Getter
public class Member {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "member_id")
        private Long memberId;

        @Column(name = "name", nullable = false)
        private String name;

        @Column(name = "email", nullable = false)
        private String email;

        @Column(name = "password", nullable = false)
        private String password;

        @Column(name = "picture")
        private String picture;

        @Column(name = "introduce")
        private String introduce;

        @Column(name = "created_at", updatable = false, nullable = false)
        private Timestamp createdAt;

        @Column(name = "updated_at", nullable = false)
        private Timestamp updatedAt;

        public Member(String name, String email, String password, String introduce) {
                this.name = name;
                this.email = email;
                this.password = password;
                this.introduce = introduce;
        }
}
