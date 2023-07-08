package com.kk.bms.rs.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class User {

    @Id
    private Integer id;
    private String userType;
    private String name;
    private String email;
    private String phone;
    private LocalDate registeredTime;
    private LocalDate inactivatedTime;
}
