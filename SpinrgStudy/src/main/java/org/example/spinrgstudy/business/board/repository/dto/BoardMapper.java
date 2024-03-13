package org.example.spinrgstudy.business.board.repository.dto;

import org.example.spinrgstudy.business.board.entity.BoardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Repository;

import javax.xml.transform.Source;

@Mapper
public interface BoardMapper {
    BoardMapper INSTANCE = Mappers.getMapper(BoardMapper.class);


    BoardDto toBoardDto(BoardEntity boardEntity);
}
