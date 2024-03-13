package org.example.spinrgstudy.business.board.controller;

import org.example.spinrgstudy.business.board.controller.request.BoardDTORequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/api/board", method = RequestMethod.DELETE)
public class BoardContoller {

    @GetMapping("{boardId}")
    public ResponseEntity<List<Map<String, String>>> getList(@PathVariable String boardId){


        return  ResponseEntity.ok(List.of(Map.of("aa","akk")));
    }

    @PostMapping("{boardId}")
    public ResponseEntity<List<Map<String, String>>> postList(@PathVariable String boardId){


        return  ResponseEntity.ok(List.of(Map.of("aa","akk")));
    }

}
