package com.tts.weather.demo.controller;

import com.tts.weather.demo.model.Request;
import com.tts.weather.demo.model.Response;
import com.tts.weather.demo.model.ZipCode;
import com.tts.weather.demo.repository.ZipCodeRepository;
import com.tts.weather.demo.service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    private ZipCodeRepository zipCodeRepository;


//    @GetMapping("/weather")
//    public String getIndex(Model model){
//        Response response = weatherService.getForecast("71129");
//        model.addAttribute("data", response);
//        return "index";
//    }

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("request", new Request());
        model.addAttribute("recentSearches", weatherService.getRecentSearches());
        return "index";
    }

    @PostMapping
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        model.addAttribute("data", data);
        return "index";
    }
}
