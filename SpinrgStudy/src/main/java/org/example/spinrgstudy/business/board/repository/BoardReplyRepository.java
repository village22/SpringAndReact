package org.example.spinrgstudy.business.board.repository;

import org.example.spinrgstudy.business.board.entity.BoardEntity;
import org.example.spinrgstudy.business.board.entity.BoardReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardReplyRepository extends JpaRepository<BoardReplyEntity, Long> {
}
