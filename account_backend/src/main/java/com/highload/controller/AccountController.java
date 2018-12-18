package com.highload.controller;

import com.highload.dto.Accounts;
import com.highload.dto.EmptyJsonResponse;
import com.highload.model.Account;
import com.highload.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

/**
 * Created by Игорь on 18.12.2018.
 */
@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/accounts/new/")
    public ResponseEntity addNew(@RequestBody Account body){
        accountService.addNewElement(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(new EmptyJsonResponse());
    }


    @GetMapping("/accounts/filter")
    public Accounts filter(@RequestParam Map<String, String> allRequestParams) {
        return new Accounts(Collections.emptyList());
    }
    @GetMapping("/accounts/count")
    public int count(){
        return accountService.getAccountsCount();
    }
}
