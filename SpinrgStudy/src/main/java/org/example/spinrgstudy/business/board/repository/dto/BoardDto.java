package org.example.spinrgstudy.business.board.repository.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BoardDto {
    private String title;
    private String content;

}
