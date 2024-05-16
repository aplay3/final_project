package com.example.nasdaq.model.Entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class weeklyUpdatesPK implements Serializable{
    private String ticker;
    private Date weeklydate;
}
