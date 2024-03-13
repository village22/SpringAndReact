package org.example.spinrgstudy.business.board.entity;

import jakarta.persistence.PrePersist;

public class MyEntityListener {
    @PrePersist
    public void prePersist(Object entity) {
        System.out.println("MyEntityListener @PrePersist: " + entity);
        // 추가적인 로직 수행 가능
    }
}
