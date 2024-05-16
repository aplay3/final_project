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
public class DailyUpdateDto {
    private Nasdaq100Entity ticker;

    private Date dailydate;

    private String name;

    private String news_summary;

    private String news_sentiment;

    private int market_cap;

    private int enterprise_val;

    private double per;

    private double pbr;
}
