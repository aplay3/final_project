package com.example.nasdaq.model.DTO;

import java.util.Date;

import com.example.nasdaq.model.Entity.Nasdaq100Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WeeklyUpdateDto {
    
    private Nasdaq100Entity ticker;

    private Date weeklydate;

    private String name;
    
    private String edgar_summary;
}
