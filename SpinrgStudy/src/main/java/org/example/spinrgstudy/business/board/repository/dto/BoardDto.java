package org.example.spinrgstudy.business.board.repository.dto;


import lombok.*;
import org.mapstruct.Mapper;

@Getter
@Builder
@AllArgsConstructor
public class BoardDto {
    private String title;
    private String content;

}
