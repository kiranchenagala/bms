package com.kk.bms.ps.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketBookingTransactionResponse {
    private String txId;
    private String txStatus;
}
