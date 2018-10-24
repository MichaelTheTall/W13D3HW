package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    public List<Whisky> getWhiskyByYear(int year);
    public List<Whisky> getWhiskyByDistilleryAndAge(String dist, int age);
    }
