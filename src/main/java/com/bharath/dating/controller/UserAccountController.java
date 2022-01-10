package com.bharath.dating.controller;

import com.bharath.dating.model.UserAccount;
import com.bharath.dating.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserAccountController {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @PostMapping("/users/register-user")
    public UserAccount registerUser(@RequestBody UserAccount userAccount){
        return userAccountRepository.save(userAccount);
    }
}
