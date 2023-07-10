package com.kk.bms.ps.payment.gateway;

import com.kk.bms.ps.domain.TicketBookingTransaction;
import com.kk.bms.ps.domain.TicketBookingTransactionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class PaymentGatewayService {

    public TicketBookingTransactionResponse payment(TicketBookingTransaction tx){
        log.info("Tx successfully completed");
        return new TicketBookingTransactionResponse(UUID.randomUUID().toString(), "Success");
    }

}
