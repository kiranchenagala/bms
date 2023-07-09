package com.kk.bms.rs.web;

import com.kk.bms.rs.constants.ApiConstants;
import com.kk.bms.rs.jpa.entities.User;
import com.kk.bms.rs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/"+ ApiConstants.API_VERSION +"/register")
public class RegistrationController {

    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public ResponseEntity<User> userRegistration(@RequestBody User user){
        return new ResponseEntity<>(userService.save(user), HttpStatus.OK);
    }
}
