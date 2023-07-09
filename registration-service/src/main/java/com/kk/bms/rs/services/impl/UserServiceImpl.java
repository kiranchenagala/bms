package com.kk.bms.rs.services.impl;

import com.kk.bms.rs.feign.clients.NotificationApiClient;
import com.kk.bms.rs.jpa.entities.User;
import com.kk.bms.rs.jpa.repositories.UserRepository;
import com.kk.bms.rs.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NotificationApiClient notificationApiClient;

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User save(User user) {
        User savedUser =  userRepository.save(user);
        log.info("User {} successfully saved...", user.getName());
        log.info("Invoking user notification service to send user notifications...");
        notificationApiClient.notifie(user);
        return savedUser;
    }

}
