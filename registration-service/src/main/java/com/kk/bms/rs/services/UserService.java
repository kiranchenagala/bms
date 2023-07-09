package com.kk.bms.rs.services;

import com.kk.bms.rs.jpa.entities.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Long id);
    Optional<User> getUserByName(String name);

    User save(User user);
}
