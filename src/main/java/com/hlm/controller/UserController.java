package com.hlm.controller;

import com.hlm.dao.UserRepository;
import com.hlm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Administrator
 * @since 2019/12/17 0017 7:07
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable Long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user;
    }
}
