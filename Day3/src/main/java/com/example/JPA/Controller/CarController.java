package com.example.JPA.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JPA.Model.CarModel;
import com.example.JPA.Service.CarService;
@RestController
public class CarController {
	@Autowired
	public CarService cser;
	//posting details
	@PostMapping("/saveCars")
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return cser.saveinfo(cr);
	}
      @DeleteMapping("/saveCars/{id}")
	//deleting details
	public String deletedetails(@PathVariable("id")int id)
	{
		cser.deletedetails(id);
		return "deleted successfully";
	}
      @GetMapping("/saveCars/{id}")
      //getting details
      public Optional<CarModel> getdetails(@PathVariable("id")int id)
      {
    	  return cser.getdetails(id);
      }
      //updating details
      @PutMapping("/update")
      public CarModel updatedetails(@RequestBody CarModel id)
      {
    	  return cser.updatedetails(id);
      }
	
}
