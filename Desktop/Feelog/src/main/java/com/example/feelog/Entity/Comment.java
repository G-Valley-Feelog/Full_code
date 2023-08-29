package com.example.feelog.Entity;



import jakarta.persistence.*;
import java.sql.Timestamp;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
@Entity
@Data
@Table(name = "Like")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @Column(name = "comment_text", nullable = false)

    private String commentText;

    @Column(name = "comment_date", updatable = false, nullable = false)
    @CreatedDate
    private Timestamp commentDate;
}
