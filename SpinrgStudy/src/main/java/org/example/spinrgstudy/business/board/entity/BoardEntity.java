package org.example.spinrgstudy.business.board.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.example.spinrgstudy.common.entiry.BaseEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "board")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Lob
    private String content;

    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY)
    private List<BoardReplyEntity> boardReply = new ArrayList<BoardReplyEntity>();

    @Builder
    public BoardEntity(String title, String content, BoardReplyEntity boardReply) {
        this.title = title;
        this.content = content;
        this.mapperBoardReply(boardReply);
    }

    public void mapperBoardReply(BoardReplyEntity boardReply){
        this.boardReply.add(boardReply);
    }
}

