package com.example.nasdaq.model.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nasdaq.model.DAO.DailyUpdatesDao;
import com.example.nasdaq.model.Entity.DailyUpdateEntity;
import com.example.nasdaq.model.Repository.DailyUpdateRepository;

@Service
public class DailyUpdatesDaoImpl implements DailyUpdatesDao{
    
    @Autowired
    private DailyUpdateRepository dailyUpdateRepository;

    @Override
    public List<DailyUpdateEntity> getAllDailyInfo() {
        // TODO Auto-generated method stub
        List<DailyUpdateEntity> entities = dailyUpdateRepository.findAll();
        return entities;
    }

    @Override
    public DailyUpdateEntity getOneDailyInfo(String ticker, String dailydate) {
        // TODO Auto-generated method stub
        DailyUpdateEntity entity = dailyUpdateRepository.findByDailyUpdatesPKTickerAndDailyUpdatesPKDailydate(ticker, dailydate);
        return entity;
    }

    

    

    
}
