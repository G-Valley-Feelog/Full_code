package com.example.feelog.Entity;



import javax.persistence.*;
import java.sql.Timestamp;
import lombok.*;
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
    private Timestamp commentDate;
}
