package com.example.nasdaq.model.DAO;

import java.util.List;

import com.example.nasdaq.model.Entity.DailyUpdateEntity;
import com.example.nasdaq.model.Entity.dailyUpdatesPK;

public interface DailyUpdatesDao {
    
    // select
    public DailyUpdateEntity getOneDailyInfo(String ticker, String dailydate);

    public List<DailyUpdateEntity> getAllDailyInfo();
}
