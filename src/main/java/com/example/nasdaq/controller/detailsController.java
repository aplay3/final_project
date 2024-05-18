package com.example.nasdaq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.nasdaq.model.DTO.DailyUpdateDto;
import com.example.nasdaq.service.DailyUpdateService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/v1/nasdaq")
@Controller
@Slf4j
public class detailsController {

    @Autowired
    private DailyUpdateService dailyUpdateService;

    @GetMapping("/details")
    public String detailsPage(Model model, @RequestParam String ticker, String dailydate){
        DailyUpdateDto dto = dailyUpdateService.getOneDailyInfo(ticker, dailydate);
        log.info("[detailsController][detailsPage] dto >>>"+dto);
        model.addAttribute("company", dailyUpdateService.getOneDailyInfo(ticker, dailydate));
        return "details";

    }

}
