package com.highload.dto;

import com.highload.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by Игорь on 18.12.2018.
 */
@Data
@AllArgsConstructor
public class Accounts {
    private List<Account> accounts;

}
