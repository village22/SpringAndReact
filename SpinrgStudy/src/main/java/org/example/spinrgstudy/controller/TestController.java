package org.example.spinrgstudy.controller;

import lombok.RequiredArgsConstructor;
import org.example.spinrgstudy.controller.dto.TestResponse;
import org.example.spinrgstudy.service.TestService;
import org.example.spinrgstudy.service.dto.TestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping(value = "/test/list")
    public ResponseEntity<List<TestResponse>> getList(){

        List<TestResponse> testResponsesList = testService.getList().stream().map(testDto -> {
            return TestResponse.builder()
                    .userid(testDto.getUserid())
                    .userName(testDto.getUserName())
                    .build();
        }).toList();

        return ResponseEntity.ok(testResponsesList);
    }
}
