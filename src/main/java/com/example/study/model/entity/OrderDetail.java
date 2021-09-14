package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"user","item"}) //연관관계가 설정되어 ToString에선 제외 시켜줘야한다
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDateTime orderAt;

    //n:1
    @ManyToOne
    private User user; //알아서 user_id를 찾아감

    //N:1
    @ManyToOne
    private Item item;
}
