package com.example.nasdaq.model.DTO;


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
    
    private Long id;
    
    private String ticker;

    private String dailydate;

    private String name;

    private String industry;

    private String news_summary;

    private String market_cap;

    private String enterprise_val;

    private double per;

    private double peg;

    private double psr;

    private double pbr;

    private double ev_ebitda;
}
