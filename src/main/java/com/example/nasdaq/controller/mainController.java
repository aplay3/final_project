package com.example.nasdaq.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.ArrayList;

import com.example.nasdaq.model.DTO.DailyUpdateDto;
import com.example.nasdaq.model.DTO.PredictpriceDto;
import com.example.nasdaq.service.DailyUpdateService;
import com.example.nasdaq.service.PredictpriceService;

@RequestMapping("/v1/nasdaq")
@Controller
public class mainController {

    @Autowired
    private PredictpriceService predictpriceservice;

    @Autowired
    private DailyUpdateService dailyUpdateService;

    @GetMapping("/index")
    public String mainPage(Model model){
        
        List<DailyUpdateDto> positive_news = new ArrayList<>();
        List<DailyUpdateDto> negative_news =  new ArrayList<>();
        List<PredictpriceDto> postiive_dtos = predictpriceservice.getTop3predict_price();
        List<PredictpriceDto> negative_dtos = predictpriceservice.getButtom3predict_price();
        
        for(PredictpriceDto dto:postiive_dtos){
            DailyUpdateDto Ddto = dailyUpdateService.getOneDailyInfo(dto.getTicker(), "2024-05-20");
            positive_news.add(Ddto);

        }
        for(PredictpriceDto dto:negative_dtos){
            DailyUpdateDto Ddto = dailyUpdateService.getOneDailyInfo(dto.getTicker(), "2024-05-20");
            negative_news.add(Ddto);
        }
        model.addAttribute("price", negative_dtos);
        model.addAttribute("price2", postiive_dtos);
        model.addAttribute("positive", negative_news);
        model.addAttribute("negative", positive_news);



        
        return "index";
    }
}
