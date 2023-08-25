package com.example.feelog.Entity;


import javax.persistence.*;
import java.sql.Timestamp;
import lombok.*;


@Data
@Entity
@Table(name = "Blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private Long blogId;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "introduce")
    private String introduce;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "created_at", updatable = false, nullable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;

}
