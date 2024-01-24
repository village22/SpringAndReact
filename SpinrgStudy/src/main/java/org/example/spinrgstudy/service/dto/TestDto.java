package org.example.spinrgstudy.service.dto;


import lombok.Builder;
import lombok.Getter;

@Getter
public class TestDto {
    private final Long userid;
    private final String userName;

    @Builder
    public TestDto(Long userId, String userName){
        this.userid = userId;
        this.userName = userName;
    }

}
