package com.example.nasdaq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.nasdaq.service.DailyUpdateService;
import com.example.nasdaq.service.Nasdaq100Service;

@RestController
@RequestMapping("/api/v1/nasdaq")
public class testController {
    
    @Autowired
    private Nasdaq100Service nasdaq100Service;

    @Autowired
    private DailyUpdateService dailyUpdateService;

    @GetMapping("/test")
    public String test(){
        return nasdaq100Service.getAllNasdaq100().toString();
    }

    @GetMapping("/test2")
    public String test2(@RequestParam String ticker){
        return nasdaq100Service.findByTicker(ticker).toString();
    }

    @GetMapping("/test3")
    public String test3(@RequestParam String ticker, String dailydate){
        return dailyUpdateService.getOneDailyInfo(ticker, dailydate).toString();
    }

    @GetMapping("/test4")
    public String test4(){
        return dailyUpdateService.getAllDailyInfo().toString();
    }
}
