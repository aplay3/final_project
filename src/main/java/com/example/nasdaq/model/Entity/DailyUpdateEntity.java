package com.example.nasdaq.model.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
@Entity(name = "DailyUpdateEntity")
@Table(name = "daily_update")
@IdClass(dailyUpdatesPK.class)
public class DailyUpdateEntity {
    
    @Id
    @NotBlank
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ticker")
    private Nasdaq100Entity ticker;

    @Id
    @NotBlank
    private Date dailydate;

    @NotBlank
    private String name;

    private String news_summary;

    private String news_sentiment;

    private int market_cap;

    private int enterprise_val;

    private double per;

    private double pbr;
}
 