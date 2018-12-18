package com.highload.db;


import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.highload.dto.Accounts;
import com.highload.model.Account;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * Created by Игорь on 18.12.2018.
 */
public class AccountsStorage {
    private List<Account> accounts = new ArrayList<>();

    public void add(Account account) {
        accounts.add(account);
    }


    public void readFromFile(String file) throws IOException {

        Gson gson = new Gson();
        List<Account> messages = new ArrayList<>();
        ZipFile zipInputStream = new ZipFile(file);
        Enumeration<? extends ZipEntry> entries = zipInputStream.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = entries.nextElement();
            if (!zipEntry.getName().startsWith("accounts_")) {
                continue;
            }
            JsonReader reader = new JsonReader(new InputStreamReader(new BufferedInputStream(zipInputStream.getInputStream(zipEntry)), "UTF-8"));

            reader.beginObject();
            reader.nextName();
            reader.beginArray();
            while (reader.hasNext()) {
                Account message = gson.fromJson(reader, Account.class);
                messages.add(message);
            }
            reader.endArray();
            reader.endObject();
            reader.close();

        }
    }

    public int count() {
        return accounts.size();
    }
}
