package com.kk.bms.ps.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketBookingTransaction {
    private Long txId;
    private User user;
    private Movie movie;
    private Theatre theatre;
    private String city;
    private String txStatus;
    private UserCardDetails userCardDetails;
    private Double amount;
    private String bankTransactionId;
}
