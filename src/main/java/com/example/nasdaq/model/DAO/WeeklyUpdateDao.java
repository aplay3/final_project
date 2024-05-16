package com.example.nasdaq.model.DAO;

import java.util.List;

import com.example.nasdaq.model.Entity.WeeklyUpdateEntity;
import com.example.nasdaq.model.Entity.weeklyUpdatesPK;

public interface WeeklyUpdateDao {
    
    // select
    public WeeklyUpdateEntity getOneWeeklyInfo(weeklyUpdatesPK ticker);

    public List<WeeklyUpdateEntity> getAllWeeklyInfo();

}
