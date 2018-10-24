package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetWhiskyByYear(){
		List<Whisky> results = whiskyRepository.getWhiskyByYear(2018);
	}

	@Test
	public void canGetWhiskyByDandA(){
		List<Whisky> results = whiskyRepository.getWhiskyByDistilleryAndAge("Rosebank", 12);
	}

	@Test
	public void canGetWhiskyByRegion(){
		List<Whisky> results = whiskyRepository.getWhiskyByRegion("Speyside");
	}

	@Test
	public void canGetDistilleryByRegion(){
		List<Distillery> results = distilleryRepository.getDistilleryByRegion("Highland");
	}

	@Test
	public void canGetDistilleryByWhiskyAge(){
		List<Distillery> results = distilleryRepository.getDistilleryByWhiskyAge(12);
	}

}
