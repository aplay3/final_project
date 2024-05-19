package com.example.nasdaq.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nasdaq.model.DAO.WeeklyUpdateDao;
import com.example.nasdaq.model.DTO.WeeklyUpdateDto;
import com.example.nasdaq.model.Entity.WeeklyUpdateEntity;
import com.example.nasdaq.service.WeeklyUpdateService;

@Service
public class WeeklyUpdateServiceImpl implements WeeklyUpdateService{
    
    @Autowired
    private WeeklyUpdateDao weeklyUpdateDao;

    @Override
    public List<WeeklyUpdateDto> getAllWeeklyInfo() {
        // TODO Auto-generated method stub
        List<WeeklyUpdateEntity> entities = weeklyUpdateDao.getAllWeeklyInfo();
        List<WeeklyUpdateDto> dtos = new ArrayList<>();
        for(WeeklyUpdateEntity entity : entities){
            WeeklyUpdateDto dto = new WeeklyUpdateDto();
            dto.setTicker(entity.getWeeklyUpdatesPK().getTicker());
            dto.setWeeklydate(entity.getWeeklyUpdatesPK().getWeeklydate());
            dto.setName(entity.getName());
            dto.setEdgar_summary(entity.getEdgar_summary());

            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public WeeklyUpdateDto getOneWeeklyInfo(String ticker, String weeklydate) {
        // TODO Auto-generated method stub
        WeeklyUpdateEntity entity = weeklyUpdateDao.getOneWeeklyInfo(ticker, weeklydate);
        WeeklyUpdateDto dto = new WeeklyUpdateDto();

        dto.setTicker(entity.getWeeklyUpdatesPK().getTicker());
        dto.setWeeklydate(entity.getWeeklyUpdatesPK().getWeeklydate());
        dto.setName((entity.getName()));
        dto.setEdgar_summary((entity.getEdgar_summary()));
        return dto;
    }

}
