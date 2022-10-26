package com.youth.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.youth.entity.Member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question2 question2;
    
    @ManyToOne
    private Member author;
    
    private LocalDateTime modifyDate;
}