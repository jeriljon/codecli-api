package com.rest.codecli.controller;

import com.rest.codecli.exception.UserAccountNotFoundException;
import com.rest.codecli.model.UserAccount;
import com.rest.codecli.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @GetMapping("/homecontent")
    public ResponseEntity<Map<String, String>> getHomePageContent() {
        Map<String, String> homePageContent = userAccountService.getHomePageContent();
        return new ResponseEntity<>(homePageContent, HttpStatus.OK);
    }

    @GetMapping("/useraccounts")
    public ResponseEntity<List<UserAccount>> getAllUserAccounts() {
        List<UserAccount> userAccounts = userAccountService.getAllUserAccounts();
        return new ResponseEntity<>(userAccounts, HttpStatus.OK);
    }

    @GetMapping("/useraccounts/{id}")
    public ResponseEntity<UserAccount> getUserAccountForId(@PathVariable String id) throws UserAccountNotFoundException {
        UserAccount userAccount = userAccountService.getUserAccountForId(Long.parseLong(id));
        return new ResponseEntity<>(userAccount, HttpStatus.OK);
    }

//    @GetMapping("/useraccounts/{id}/{username}/{email}/{password}/update")
//    public ResponseEntity<List<UserAccount>> updateUserAccount(String id, String username, String email, String password) {
//        List<UserAccount> userAccounts = userAccountService.getAllUserAccounts();
//        UserAccount userAccount = userAccounts.stream().filter(userAccount1 -> userAccount1.getId().equals(id)).findFirst().get();
//        userAccount.setUsername(username);
//        userAccount.setEmail(email);
//        userAccount.setPassword(password);
//        userAccounts.add(Integer.parseInt(id), userAccount);
//        return new ResponseEntity<>(userAccounts, HttpStatus.OK);
//    }



}
