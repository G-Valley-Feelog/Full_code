package com.example.feelog.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import lombok.*;


@Entity
@Data
@Table(name = "Like")
public class Like {
    @Id
    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Id
    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;
}
