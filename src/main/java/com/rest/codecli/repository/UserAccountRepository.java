package com.rest.codecli.repository;

import com.rest.codecli.model.UserAccount;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserAccountRepository {

    // TODO: Implement UserAccountRepository with Spring Data JPA & AWS RDS MySQL database

    public List<UserAccount> getAllUserAccounts() {
        List<UserAccount> userAccounts = new ArrayList<>();
        userAccounts.add(new UserAccount(1L, "tom", "tom@email.com", "tom2023"));
        userAccounts.add(new UserAccount(2L, "sam", "sam@email.com", "sam2023"));
        userAccounts.add(new UserAccount(3L, "bob", "bob@email.com", "bob2023"));
        userAccounts.add(new UserAccount(4L, "jim", "jim@email.com", "jim2023"));
        userAccounts.add(new UserAccount(5L, "mel", "mel@email.com", "mel2023"));
        return userAccounts;
    }

    public UserAccount getUserAccountForId(Long id) {
        List<UserAccount> userAccounts = getAllUserAccounts();
        return userAccounts.stream().filter(userAccount -> userAccount.getId().equals(id)).findFirst().get();
    }

    public Map<String, String> getHomePageContent() {
        Map<String, String > homePageContent = new HashMap<>();
        homePageContent.put("title", "Welcome to the Code CLI Home Page");
        homePageContent.put("body", "This is the body of the home page");
        homePageContent.put("footer", "This is the footer of the home page");
        return homePageContent;
    }


}
