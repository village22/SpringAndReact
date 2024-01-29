package org.example.spinrgstudy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import lombok.extern.slf4j.Slf4j;
import org.example.spinrgstudy.business.board.entity.BoardEntity;
import org.example.spinrgstudy.business.board.entity.BoardReplyEntity;
import org.example.spinrgstudy.business.board.repository.BoardReplyRepository;
import org.example.spinrgstudy.business.board.repository.BoardRepository;
import org.example.spinrgstudy.business.board.repository.dto.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
@Slf4j
public class SpinrgStudyApplicationTests {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardReplyRepository boardReplyRepository;

    @Test
    void tessfd(){
        log.debug("kakaka");
    }

    @Test
    void contextLoads() {

        try(EntityManager em = entityManagerFactory.createEntityManager()){
            EntityTransaction et = em.getTransaction();

            try {
                et.begin();
//                BoardReplyEntity boardReplyEntity = BoardReplyEntity.builder()
//                        .content("답글입니다.1")
//                        .build();
//
//                BoardReplyEntity boardReplyEntity2 = BoardReplyEntity.builder()
//                        .content("답글입니다.2")
//                        .build();
//
//                BoardEntity boardEntity = BoardEntity.builder()
//                        .title("테스트1")
//                        .content("내용입니다.1")
//                        .build();
//
////                boardEntity.mapperBoardReply(boardReplyEntity);
////                boardEntity.mapperBoardReply(boardReplyEntity2);
//
//                boardReplyEntity.mapperBoard(boardEntity);
//                boardReplyEntity2.mapperBoard(boardEntity);
//
//                log.debug("========== 영속 ==========");
//                em.persist(boardEntity);
//                em.persist(boardReplyEntity);
//                em.persist(boardReplyEntity2);
//                log.debug("=========================");


                log.debug("========== find ==========");

//                TypedQuery<BoardEntity> query = em.createQuery("""
//                    select e
//                    from BoardEntity e
//                    where e.id in (1,2)
//                    """, BoardEntity.class);
//
//                List<BoardEntity> list = query.getResultList();
//
//                BoardEntity test = list.get(0);

                BoardEntity test = em.find(BoardEntity.class, 1L);

                log.debug("------");
                log.debug("데이터:"+test.getId()+", "+test.getContent());
                log.debug("------");


                BoardDto boardDto = BoardMapper.INSTANCE.toBoardDto(test);

                log.debug(boardDto.getTitle());
                log.debug(boardDto.getContent());

//
//                log.debug("anno size : "+ ano.length);
//                Arrays.stream(ano).forEach(annotation -> log.debug(annotation.toString()));


//
//                log.debug("====================");
//                log.debug("------");
//                log.debug("연결된 객체 사용:"+test.getBoardReply().get(0).getContent());
//                log.debug("------");
//                log.debug("연결된 객체 사용:"+test.getBoardReply().get(1).getContent());
//                log.debug("------");
//                log.debug("연결된 객체 사용:"+test.getBoardReply().get(2).getContent());
//                log.debug("------");
//
//                test = list.get(1);
//
//                log.debug("------");
//                log.debug("데이터:"+test.getId()+", "+test.getContent());
//                log.debug("------");
//
//                log.debug("====================");
//                log.debug("------");
//                log.debug("연결된 객체 사용:"+test.getBoardReply().get(0).getContent());
//                log.debug("------");

//                TypedQuery<BoardReplyEntity> query = em.createQuery("""
//                    select e
//                    from  BoardReplyEntity e
//                    where e.id in (1, 4)
//                    """, BoardReplyEntity.class);
//
//                List<BoardReplyEntity> list = query.getResultList();
//
////                BoardReplyEntity test = em.find(BoardReplyEntity.class, 1L);
//
//                    log.debug("------");
////                    BoardReplyEntity test = query.getSingleResult();
//                    BoardReplyEntity test = list.get(0);
//                    log.debug("------");
//                    log.debug("데이터:"+test.getId()+", "+test.getContent());
//                    log.debug("------");
//
//                    log.debug("====================");
//                    log.debug("------");
//                    log.debug("연결된 객체 사용:"+test.getBoard().getTitle());
//                    log.debug("------");
//
//                    log.debug("------");
//                    log.debug("연결된 객체 사용 reaply0:"+test.getBoard().getBoardReply().get(0).getContent());
//                    log.debug("------");
//                    log.debug("연결된 객체 사용 reaply1:"+test.getBoard().getBoardReply().get(1).getContent());
//                    log.debug("------");
//
//                    log.debug("------ 다른 데이터 참조 ------");

//                    test = list.get(1);
//                    log.debug("------");
//                    log.debug("데이터:"+test.getId()+", "+test.getContent());
//                    log.debug("------");
//
//                    log.debug("====================");
//                    log.debug("------");
//                    log.debug("연결된 객체 사용:"+test.getBoard().getTitle());
//                    log.debug("------");
//
//                    log.debug("------");
//                    log.debug("연결된 객체 사용 reaply0:"+test.getBoard().getBoardReply().get(0).getContent());
//                    log.debug("------");

                et.commit();
            }catch(Exception e){
                e.printStackTrace();
                et.rollback();
            }

            log.debug("========== 완료 ==========");


        }
    }


//    @Test
    void  test1(){
        log.debug("sldkjfsdlk");
    }


}
