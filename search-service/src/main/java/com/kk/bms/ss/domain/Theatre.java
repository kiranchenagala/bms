package com.kk.bms.ss.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Theatre {
    private int id;
    private User owner;
    private String description;
    private LocalDateTime onboarded;
    private boolean isActive;
    private String city;
    private String pincode;
    private Map<String, String> seatingGrid;
    private List<String> showTimings;
}
