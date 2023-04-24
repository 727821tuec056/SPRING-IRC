package com.example.JPA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPA.Model.CarModel;
import com.example.JPA.Repository.CarRepository;
@Service
public class CarService {
	@Autowired
	public CarRepository crepo;
	public CarModel saveinfo(CarModel c)
	{
		return crepo.save(c);
	}

}

