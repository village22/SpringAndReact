package org.example.spinrgstudy.common.entiry;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.ZonedDateTime;


@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseEntity {
    @Column(name = "reg_dttm", updatable = false)
    private ZonedDateTime regDateTime;

    @Column(name = "mod_dttm")
    private ZonedDateTime modDateTime;

    @PrePersist
    public void prePersist(){
        this.regDateTime = ZonedDateTime.now();
        this.modDateTime = this.regDateTime;
    }

    @PreUpdate
    public void preUpdate(){
        this.modDateTime = ZonedDateTime.now();
    }
}
