package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

//    @Autowired
//    WhiskyRepository whiskyRepository;

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "byregion/{region}")
    public List<Distillery> getDistilleryByRegion(@PathVariable String region) {
        return distilleryRepository.getDistilleryByRegion(region);
    }

    @GetMapping(value = "byage/{age}")
    public List<Distillery> getDistilleryByWhiskyAge(@PathVariable int age) {
        return distilleryRepository.getDistilleryByWhiskyAge(age);
    }

}
