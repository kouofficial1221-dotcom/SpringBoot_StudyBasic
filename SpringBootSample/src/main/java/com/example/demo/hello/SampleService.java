package com.example.demo.hello;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	@Autowired
	private SampleRepository sampleRepository;
	
	public Sample getSample(String id) {
		Optional<Sample> optionalSample = sampleRepository.findById(id);
		
		Sample sample = optionalSample.get();
		
		return sample;
	}
	
}
