package com.example.nasdaq.service;

import java.util.List;

import com.example.nasdaq.model.DTO.WeeklyUpdateDto;

public interface WeeklyUpdateService {
    public WeeklyUpdateDto getOneWeeklyInfo(String ticker, String dailydate);

    public List<WeeklyUpdateDto> getAllWeeklyInfo();
}
