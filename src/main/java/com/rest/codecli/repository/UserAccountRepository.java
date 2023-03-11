package com.rest.codecli.repository;

import com.rest.codecli.model.UserAccount;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserAccountRepository {

    // TODO: Implement UserAccountRepository with Spring Data JPA & AWS RDS MySQL database

    public List<UserAccount> getAllUserAccounts() {
        List<UserAccount> userAccounts = new ArrayList<>();
        userAccounts.add(new UserAccount(1L, "tom", "tom@email.com", "tom2023"));
        userAccounts.add(new UserAccount(2L, "sam", "sam@email.com", "sam2023"));
        userAccounts.add(new UserAccount(3L, "bob", "bob@email.com", "bob2023"));
        userAccounts.add(new UserAccount(4L, "jim", "jim@email.com", "jim2023"));
        return userAccounts;
    }


}
