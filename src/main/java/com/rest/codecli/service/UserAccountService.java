package com.rest.codecli.service;

import com.rest.codecli.exception.UserAccountNotFoundException;
import com.rest.codecli.model.UserAccount;
import com.rest.codecli.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    public List<UserAccount> getAllUserAccounts() {
        return userAccountRepository.getAllUserAccounts();
    }

    public UserAccount getUserAccountForId(Long id) throws UserAccountNotFoundException {
        return userAccountRepository.getUserAccountForId(id);
    }

    public Map<String, String> getHomePageContent() {
        return userAccountRepository.getHomePageContent();
    }


}
