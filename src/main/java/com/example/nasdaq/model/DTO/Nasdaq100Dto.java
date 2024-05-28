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
public class Nasdaq100Dto {
    private String ticker;
    private String name;
    private String established;

    private String CEO;

    private String products;

    private String milestones;

    private String industry;
}
