package com.kk.bms.rs.jpa.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name="BMC_USER")
@Getter
@Setter
public class User {

    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="user_type")
    private String userType;
    @Column(name="name")
    private String name;
    private String email;
    private String phone;
    @CreationTimestamp
    private LocalDate registeredTime;
    private LocalDate inactivatedTime;
}
