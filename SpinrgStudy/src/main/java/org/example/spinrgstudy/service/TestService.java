package org.example.spinrgstudy.service;

import lombok.RequiredArgsConstructor;
import org.example.spinrgstudy.entity.TestEntity;
import org.example.spinrgstudy.repository.TestRepository;
import org.example.spinrgstudy.service.dto.TestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TestService {

    private final TestRepository testRepository;

    public List<TestDto> getList(){
        List<TestEntity> testList = testRepository.findAll();

        List<TestDto> dtoList = testList.stream().map(testEntity -> {
            return TestDto.builder()
                    .userId(testEntity.getId())
                    .userName(testEntity.getUserName())
                    .build();
        }).toList();

        return dtoList;
    }
}
