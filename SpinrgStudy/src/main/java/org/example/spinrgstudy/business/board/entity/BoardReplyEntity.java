package org.example.spinrgstudy.business.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "board_reply")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class BoardReplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private BoardEntity board;

    @Builder
    private BoardReplyEntity(String content, BoardEntity board) {
        this.content = content;
        this.board = board;
    }

}
