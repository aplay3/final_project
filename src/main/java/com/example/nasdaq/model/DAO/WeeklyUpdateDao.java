package com.example.nasdaq.model.DAO;

import java.util.List;

import com.example.nasdaq.model.Entity.WeeklyUpdateEntity;

public interface WeeklyUpdateDao {
    
    // select
    public WeeklyUpdateEntity getOneWeeklyInfo(String ticker, String weeklydate);

    public List<WeeklyUpdateEntity> getAllWeeklyInfo();

}
