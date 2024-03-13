package org.example.spinrgstudy;

import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.impl.HeaderClaimsHolder;
import com.auth0.jwt.impl.HeaderSerializer;
import com.auth0.jwt.impl.PayloadClaimsHolder;
import com.auth0.jwt.impl.PayloadSerializer;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import io.jsonwebtoken.Claims;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import lombok.extern.slf4j.Slf4j;
import org.example.spinrgstudy.business.board.entity.BoardEntity;
import org.example.spinrgstudy.business.board.entity.BoardReplyEntity;
import org.example.spinrgstudy.business.board.entity.ReadType;
import org.example.spinrgstudy.business.board.repository.BoardReplyRepository;
import org.example.spinrgstudy.business.board.repository.BoardRepository;
import org.example.spinrgstudy.business.board.repository.dto.BoardDto;
import org.example.spinrgstudy.business.board.repository.dto.BoardMapper;
import org.example.spinrgstudy.common.entiry.BaseEntity;
import org.example.spinrgstudy.properties.TestProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@ConfigurationPropertiesScan("org.example.spinrgstudy.properties")
@SpringBootTest
@Slf4j
public class SpinrgStudyApplicationTests {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardReplyRepository boardReplyRepository;
    
    @Autowired
    private TestProperties testProperties;


//    @Test
//    @Disabled
    void tessfd(){
        log.debug("kakaka");
        try(EntityManager em = entityManagerFactory.createEntityManager()) {
            EntityTransaction et = em.getTransaction();

            try {
                et.begin();



                et.commit();
            }catch(Exception e){
                e.printStackTrace();
                et.rollback();
            }

            log.debug("========== 완료 ==========");
        }

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
//                        .readType(ReadType.W)
//                        .build();
//
//                boardEntity.mapperBoardReply(boardReplyEntity);
//                boardEntity.mapperBoardReply(boardReplyEntity2);

//                boardReplyEntity.mapperBoard(boardEntity);
//                boardReplyEntity2.mapperBoard(boardEntity);
                log.debug("ReadType.W:"+ReadType.W);
                log.debug("ReadType.W:"+ReadType.W.name());
                log.debug("========== 영속 ==========");
//                em.persist(boardEntity);
//                em.persist(boardReplyEntity);
//                em.persist(boardReplyEntity2);
                log.debug("=========================");


                log.debug("========== find ==========");

                TypedQuery<BoardEntity> query = em.createQuery("""
                    select e
                    from BoardEntity e
                    where e.id in (1)
                    """, BoardEntity.class);

//                List<BoardEntity> list = query.getResultList();

//                BoardEntity test = list.get(0);
                BoardEntity test = query.getSingleResult();

//                BoardEntity test = em.find(BoardEntity.class, 1L);

                log.debug("------");
                log.debug("데이터:"+test.getId()+", "+test.getContent());
                log.debug("------");
                log.debug("=======================================");

//                TypedQuery<BoardEntity> query1 = em.createQuery("""
//                    select e
//                    from BoardEntity e
//                    where e.id in (1)
//                    """, BoardEntity.class);

                BoardEntity test1 = query.getSingleResult();

//                BoardEntity test1 = list1.get(0);

//                BoardEntity test = em.find(BoardEntity.class, 1L);

                log.debug("------");
                log.debug("데이터:"+test1.getId()+", "+test1.getContent());
                log.debug("------");
//
//
//                BoardDto boardDto = BoardMapper.INSTANCE.toBoardDto(test);
//
//                log.debug(boardDto.getTitle());
//                log.debug(boardDto.getContent());

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
    void  test1() {

        log.debug("sldkjfsdlk");
        BCryptPasswordEncoder pa = new BCryptPasswordEncoder();

        log.debug("설정값확인: "+ testProperties.getName());
        String text = "41afiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekrafiqoiwekr9872617627987261762798726176279872617627987261762748761";
        log.debug(pa.encode(text));
        log.debug("검증:"+pa.matches(text, "$2a$10$feXLmGFjlQw3p8D6OxHfKOJZo6IKaTc.ycDuhKqcIcQN7ghWvm6C."));

        String t1 = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9";
        String t2 = "eyJpc3MiOiJ0ZXN0LmJpenBheS5jby5rciIsImV4cCI6MTcwNjc1NzU2MiwiaWF0IjoxNzA2NzUzOTYyfQ";
        String t3 = "CRL7cxabCtvPc-S4Jcn_eNqeaE9xORTFjNnt0qa8OcXYDwkL7f0jbLkXUa0ok45C83LepQl9_L3ViI3GRMgptA";

        log.debug("시간:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(1706756943)));

        log.debug("복호하:"+new String(Base64.getUrlDecoder().decode(t1)));
        log.debug("복호하:"+new String(Base64.getUrlDecoder().decode(t2)));
        log.debug("복호하:"+new String(Base64.getUrlDecoder().decode(t3)));

        Date now = new Date();
        int expirySecond = 3600;


        log.debug("시간:"+new Date(now.getTime() + expirySecond * 1_000L));
        log.debug("시간:"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(now.getTime() + expirySecond * 1_000L)));



    }


}
