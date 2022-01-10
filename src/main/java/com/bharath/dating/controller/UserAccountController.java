package com.bharath.dating.controller;

import com.bharath.dating.model.Interest;
import com.bharath.dating.model.UserAccount;
import com.bharath.dating.repository.InterestRepository;
import com.bharath.dating.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
