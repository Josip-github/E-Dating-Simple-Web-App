package com.bharath.dating.controller;

import com.bharath.dating.model.Interest;
import com.bharath.dating.model.UserAccount;
import com.bharath.dating.repository.InterestRepository;
import com.bharath.dating.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserAccountController {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Autowired
    private InterestRepository interestRepository;

    @PostMapping("/users/register-user")
    public UserAccount registerUser(@RequestBody UserAccount userAccount){
        return userAccountRepository.save(userAccount);
    }

    @PostMapping("/interest/update")
    public Interest updateInterest(@RequestBody Interest interest){
        Optional<UserAccount> userAccount = userAccountRepository.findById(interest.getUserAccountId());
        interest.setUserAccount(userAccount.get());
        return interestRepository.save(interest);
    }

    @GetMapping("/users/get/all")
    public List<UserAccount> getUsers(){
        return userAccountRepository.findAll();
    }
}
