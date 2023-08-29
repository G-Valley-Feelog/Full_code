package com.example.feelog.Entity;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import jakarta.validation.constraints.NotNull;
import java.sql.Timestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
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
    @CreatedDate
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Timestamp updatedAt;

    @jakarta.persistence.Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
