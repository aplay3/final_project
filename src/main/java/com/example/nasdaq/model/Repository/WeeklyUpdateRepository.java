package com.example.nasdaq.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nasdaq.model.Entity.WeeklyUpdateEntity;
import com.example.nasdaq.model.Entity.weeklyUpdatesPK;

public interface WeeklyUpdateRepository extends JpaRepository<WeeklyUpdateEntity, weeklyUpdatesPK>{
    public WeeklyUpdateEntity findByWeeklyUpdatesPKTickerAndWeeklyUpdatesPKWeeklydate(String ticker, String weeklydate);
}
