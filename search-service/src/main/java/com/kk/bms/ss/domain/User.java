package com.kk.bms.ss.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {
    private Integer id;
    private String userType;
    private String name;
    private String email;
    private String phone;
    private LocalDate registeredTime;
    private LocalDate inactivatedTime;
}
