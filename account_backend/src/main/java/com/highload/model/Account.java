package com.highload.model;

import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Игорь on 18.12.2018.
 */
@Data
public class Account {
    private int id;
    private String email;
    private String fname;
    private String sname;
    private String phone;
    private String sex;
    private long birth;
    private String country;
    private String city;
    private long joined;
    private String status;
    private List<String> interests;
    private DateRange premium;
    private List<Like> likes;
}
