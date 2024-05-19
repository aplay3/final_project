package com.example.nasdaq.model.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="WeeklyUpdateEntity")
@Table(name="weekly_update")
// @IdClass(weeklyUpdatesPK.class)
public class WeeklyUpdateEntity {
    
    // @Id
    // @NotBlank
    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name="ticker")
    // private Nasdaq100Entity ticker;

    // @Id
    // @NotBlank
    // private Date weeklydate;

    @EmbeddedId
    private weeklyUpdatesPK weeklyUpdatesPK;

    @NotBlank
    private String name;
    
    private String edgar_summary;
}
