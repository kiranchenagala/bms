package com.kk.bms.rs.web;

import com.kk.bms.rs.constants.ApiConstants;
import com.kk.bms.rs.jpa.entities.User;
import com.kk.bms.rs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/"+ApiConstants.API_VERSION +"/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/id")
    public ResponseEntity<User> getUserById(@RequestParam("id")  Long id){
        return new ResponseEntity<>(userService.getUserById(id).get(), HttpStatus.OK);
    }

    @RequestMapping("/name")
    public ResponseEntity<User> getUserByName(@RequestParam("name")String name){
        return new ResponseEntity<>(userService.getUserByName(name).get(), HttpStatus.OK);
    }
}
