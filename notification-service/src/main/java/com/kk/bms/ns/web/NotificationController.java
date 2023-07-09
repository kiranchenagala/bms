package com.kk.bms.ns.web;

import com.kk.bms.ns.constants.ApiConstants;
import com.kk.bms.ns.domain.User;
import com.kk.bms.ns.service.NotifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/"+ ApiConstants.API_VERSION +"/notify")
public class NotificationController {

    @Autowired
    private NotifierService registrationNotifierService;

    @PostMapping
    public ResponseEntity<Boolean> notifie(@RequestBody User user){
        return new ResponseEntity<>(registrationNotifierService.notifie(user), HttpStatus.OK);
    }

}
