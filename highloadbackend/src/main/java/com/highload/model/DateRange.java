package com.highload.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Игорь on 18.12.2018.
 */
@Data
@AllArgsConstructor
public class DateRange {
    private long start;
    private long finish;
}
