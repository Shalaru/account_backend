package com.highload.config;

import com.highload.db.AccountsStorage;
import com.highload.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Created by Игорь on 18.12.2018.
 */
@Configuration
public class DBConfiguration {

    @Bean
    public AccountsStorage accountsStorage() throws IOException {

        AccountsStorage accountsStorage = new AccountsStorage();
        accountsStorage.readFromFile("C:\\olimp\\highload_cup\\2019\\test_accounts_181218\\data\\data.zip");
        return accountsStorage;
    }

    @Bean
    public AccountService accountService(AccountsStorage accountsStorage) {
        return new AccountService(accountsStorage);
    }
}
