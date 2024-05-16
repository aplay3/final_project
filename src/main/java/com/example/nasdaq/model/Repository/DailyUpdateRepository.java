package com.example.nasdaq.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nasdaq.model.Entity.WeeklyUpdateEntity;
import com.example.nasdaq.model.Entity.weeklyUpdatesPK;

public interface DailyUpdateRepository extends JpaRepository<WeeklyUpdateEntity, weeklyUpdatesPK>{
    
}
