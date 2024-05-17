package com.example.nasdaq.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nasdaq.model.Entity.DailyUpdateEntity;
import com.example.nasdaq.model.Entity.dailyUpdatesPK;

public interface DailyUpdateRepository extends JpaRepository<DailyUpdateEntity, dailyUpdatesPK>{
    public DailyUpdateEntity findByDailyUpdatesPKTickerAndDailyUpdatesPKDailydate(String ticker, String dailydate);
}
