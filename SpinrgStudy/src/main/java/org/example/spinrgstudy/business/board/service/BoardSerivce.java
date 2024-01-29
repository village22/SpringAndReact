package org.example.spinrgstudy.business.board.service;

import lombok.RequiredArgsConstructor;
import org.example.spinrgstudy.business.board.repository.BoardReplyRepository;
import org.example.spinrgstudy.business.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardSerivce {

    private final BoardRepository boardRepository;
    private final BoardReplyRepository boardReplyRepository;



}
