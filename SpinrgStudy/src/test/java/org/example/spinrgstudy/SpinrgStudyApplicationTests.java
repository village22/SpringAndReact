package org.example.spinrgstudy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.example.spinrgstudy.business.board.controller.BoardContoller;
import org.example.spinrgstudy.business.board.entity.BoardEntity;
import org.example.spinrgstudy.business.board.entity.BoardReplyEntity;
import org.example.spinrgstudy.business.board.repository.BoardReplyRepository;
import org.example.spinrgstudy.business.board.repository.BoardRepository;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.util.List;
import java.util.Optional;


@SpringBootTest
public class SpinrgStudyApplicationTests {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(SpinrgStudyApplicationTests.class);

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardReplyRepository boardReplyRepository;


    @Test
    void contextLoads() {

        try(EntityManager em = entityManagerFactory.createEntityManager()){
            EntityTransaction et = em.getTransaction();

            try {
                et.begin();
//                BoardReplyEntity boardReplyEntity = BoardReplyEntity.builder()
//                      .content("답글입니다.1")
//                      .build();
//
//                BoardReplyEntity boardReplyEntity2 = BoardReplyEntity.builder()
//                      .content("답글입니다.2")
//                      .build();
//
//                BoardEntity boardEntity = BoardEntity.builder()
//                      .title("테스트1")
//                      .content("내용입니다.1")
//                      .build();
//
//                boardEntity.mapperBoardReply(boardReplyEntity);
//                boardEntity.mapperBoardReply(boardReplyEntity2);
//
//                boardReplyEntity.mapperBoard(boardEntity);
//                boardReplyEntity2.mapperBoard(boardEntity);

//                System.out.println("========== 영속 ==========");
//                em.persist(boardEntity);
//                em.persist(boardReplyEntity);
//                em.persist(boardReplyEntity2);
//                System.out.println("=========================");


                System.out.println("========== find ==========");
//                em.clear();
                TypedQuery<BoardEntity> query = em.createQuery("""
                    select e
                    from BoardEntity e
                    where e.id in (1,2)
                    """, BoardEntity.class);

                List<BoardEntity> list = query.getResultList();

//                BoardEntity test = em.find(BoardEntity.class, 1L);
                BoardEntity test = list.get(0);

                System.out.println("------");
                System.out.println("데이터:"+test.getId()+", "+test.getContent());
                System.out.println("------");

                System.out.println("====================");
                System.out.println("------");
                System.out.println("연결된 객체 사용:"+test.getBoardReply().get(0).getContent());
                System.out.println("------");
                System.out.println("연결된 객체 사용:"+test.getBoardReply().get(1).getContent());
                System.out.println("------");
                System.out.println("연결된 객체 사용:"+test.getBoardReply().get(2).getContent());
                System.out.println("------");

                test = list.get(1);

                System.out.println("------");
                System.out.println("데이터:"+test.getId()+", "+test.getContent());
                System.out.println("------");

                System.out.println("====================");
                System.out.println("------");
                System.out.println("연결된 객체 사용:"+test.getBoardReply().get(0).getContent());
                System.out.println("------");

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
//                    System.out.println("------");
////                    BoardReplyEntity test = query.getSingleResult();
//                    BoardReplyEntity test = list.get(0);
//                    System.out.println("------");
//                    System.out.println("데이터:"+test.getId()+", "+test.getContent());
//                    System.out.println("------");
//
//                    System.out.println("====================");
//                    System.out.println("------");
//                    System.out.println("연결된 객체 사용:"+test.getBoard().getTitle());
//                    System.out.println("------");
//
//                    System.out.println("------");
//                    System.out.println("연결된 객체 사용 reaply0:"+test.getBoard().getBoardReply().get(0).getContent());
//                    System.out.println("------");
//                    System.out.println("연결된 객체 사용 reaply1:"+test.getBoard().getBoardReply().get(1).getContent());
//                    System.out.println("------");
//
//                    System.out.println("------ 다른 데이터 참조 ------");

//                    test = list.get(1);
//                    System.out.println("------");
//                    System.out.println("데이터:"+test.getId()+", "+test.getContent());
//                    System.out.println("------");
//
//                    System.out.println("====================");
//                    System.out.println("------");
//                    System.out.println("연결된 객체 사용:"+test.getBoard().getTitle());
//                    System.out.println("------");
//
//                    System.out.println("------");
//                    System.out.println("연결된 객체 사용 reaply0:"+test.getBoard().getBoardReply().get(0).getContent());
//                    System.out.println("------");

                et.commit();
            }catch(Exception e){
                e.printStackTrace();
                et.rollback();
            }

            System.out.println("========== 완료 ==========");


        }
    }


//    @Test
    void  test1(){
        System.out.println("sldkjfsdlk");
    }


}
