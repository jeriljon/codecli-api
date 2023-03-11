package com.rest.codecli.controller;

import com.rest.codecli.model.UserAccount;
import com.rest.codecli.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @GetMapping("/")
    public ResponseEntity<String> getHomePageData() {
        return new ResponseEntity<>("Welcome to the Code CLI Home Page", HttpStatus.OK);
    }

    @GetMapping("/useraccounts")
    public ResponseEntity<List<UserAccount>> getAllUserAccounts() {
        List<UserAccount> userAccounts = userAccountService.getAllUserAccounts();
        return new ResponseEntity<>(userAccounts, HttpStatus.OK);
    }



}
