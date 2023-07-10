package com.kk.bms.ps.web;

import com.kk.bms.ps.constants.ApiConstants;
import com.kk.bms.ps.domain.TicketBookingTransaction;
import com.kk.bms.ps.domain.TicketBookingTransactionResponse;
import com.kk.bms.ps.payment.gateway.PaymentGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/"+ ApiConstants.API_VERSION +"/payment")
public class PaymentController {

    @Autowired
    private PaymentGatewayService paymentGatewayService;

    @PostMapping("/pay")
    public ResponseEntity<TicketBookingTransactionResponse> payment(@RequestBody TicketBookingTransaction ticketBookingTransaction){
        return new ResponseEntity<>(paymentGatewayService.payment(ticketBookingTransaction), HttpStatus.OK);
    }
}
