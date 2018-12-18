package com.highload.service;

import com.highload.db.AccountsStorage;
import com.highload.model.Account;

/**
 * Created by Игорь on 18.12.2018.
 */
public class AccountService {
    private final AccountsStorage accountsStorage;


    public AccountService(AccountsStorage accountsStorage) {
        this.accountsStorage = accountsStorage;
    }

    public void addNewElement(Account account){

    }

    public int getAccountsCount() {
        return accountsStorage.count();
    }
}
