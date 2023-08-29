package com.example.feelog.Entity;

import jakarta.persistence.*;
import java.sql.Timestamp;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
@Entity
@Data
@Table(name = "Board")

public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long boardId;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "blog_id", nullable = false)
    private Blog blog;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "created_at", updatable = false, nullable = false)
    @CreatedDate
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Timestamp updatedAt;

}
