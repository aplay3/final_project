package com.example.nasdaq.model.Entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@Embeddable
public class MarketUpdatesPK implements Serializable{

    @NotBlank
    private String dt;

    @NotBlank
    private String marketName;

}
