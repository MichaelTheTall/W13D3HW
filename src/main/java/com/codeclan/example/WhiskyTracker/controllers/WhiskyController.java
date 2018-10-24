package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "byregion/{region}")
    public List<Whisky> getWhiskyByRegion(@PathVariable String region) {
        return whiskyRepository.getWhiskyByRegion(region);
    }

    @GetMapping(value = "byyear/{year}")
    public List<Whisky> getWhiskyByYear(@PathVariable int year) {
        return whiskyRepository.getWhiskyByYear(year);
    }

    @GetMapping(value = "bydistandage/{dist}/{age}")
    public List<Whisky> getWhiskyByDistilleryAndAge(@PathVariable String dist, @PathVariable int age) {
        return whiskyRepository.getWhiskyByDistilleryAndAge(dist, age);
    }



}
