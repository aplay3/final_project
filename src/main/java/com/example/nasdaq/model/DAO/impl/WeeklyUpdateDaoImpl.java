package com.example.nasdaq.model.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nasdaq.model.DAO.WeeklyUpdateDao;
import com.example.nasdaq.model.Entity.WeeklyUpdateEntity;
import com.example.nasdaq.model.Repository.WeeklyUpdateRepository;

@Service
public class WeeklyUpdateDaoImpl implements WeeklyUpdateDao{
    
    @Autowired
    private WeeklyUpdateRepository weeklyUpdateRepository;

    @Override
    public List<WeeklyUpdateEntity> getAllWeeklyInfo() {
        // TODO Auto-generated method stub
        List<WeeklyUpdateEntity> entities = weeklyUpdateRepository.findAll();
        return entities;
    }

    @Override
    public WeeklyUpdateEntity getOneWeeklyInfo(String ticker, String weeklydate) {
        // TODO Auto-generated method stub
        WeeklyUpdateEntity entity = weeklyUpdateRepository.findByWeeklyUpdatesPKTickerAndWeeklyUpdatesPKWeeklydate(ticker, weeklydate);
        return entity;
    }

    
}
