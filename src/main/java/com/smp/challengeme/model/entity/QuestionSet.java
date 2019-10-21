package com.smp.challengeme.model.entity;

import lombok.*;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Getter
@Immutable
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "CM_QUESTION_SET")
@SequenceGenerator(name = "SEQ_QS", sequenceName = "CM_SEQ_QS_01", allocationSize = 1)
public class QuestionSet {

    @Id
    @Column(name = "QS_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_QS")
    @Builder.Default
    private Long id = null;

    @NotNull
    @Lob
    @Column(name = "QS_XLS_FILE", columnDefinition = "BLOB")
    private byte[] file;


}

