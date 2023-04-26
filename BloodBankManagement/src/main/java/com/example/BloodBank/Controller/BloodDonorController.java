package com.example.BloodBank.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BloodBank.Model.BloodDonorModel;
import com.example.BloodBank.Service.BloodDonorService;

@RestController
public class BloodDonorController {
     
	@Autowired
	public BloodDonorService dser;
	//posting details
	@PostMapping("/blood")
	public BloodDonorModel addDetails(@RequestBody BloodDonorModel dr)
	{
		return dser.saveinfo(dr);
	}
	//deleting details  
	@DeleteMapping("/blood/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		dser.deletedetails(id);
		return "Deleted successfully";
	}
	//getting details
	@GetMapping("/blood/{id}")
	public Optional<BloodDonorModel> getdetails(@PathVariable("id")int id)
	{
		return dser.getdetails(id);
	}
	
	//updating details
	@PutMapping("/update")
	public BloodDonorModel updatedetails(@RequestBody BloodDonorModel id)
	{
		return dser.updatedetails(id);
	}
	
	//sort by ascending order
	@GetMapping("sortAsce/{dname}")
	public List<BloodDonorModel> sortPerson(@PathVariable("dname") String dname)
	{
		
		return dser.sortAsce(dname);
	}
	
	//sort by descending order
	@GetMapping("sortDesce/{dname}")
	public List<BloodDonorModel> sortPersons(@PathVariable("dname")String dname)
	{
		return dser.sortDesce(dname);
	}
	//pagination
	@GetMapping("/pagination/{pgnu}/{pgs}")
	public List<BloodDonorModel> paginationData(@PathVariable("pgnu")int pgnu,@PathVariable("pgs")int pgs)
	{
		return dser.paginationData(pgnu,pgs);
	}
	//pagination and sorting
	@GetMapping("/paginationsorting/{pgnu}/{pgs}/{dname}")
	public List<BloodDonorModel> paginationSorting(@PathVariable("pgnu") int pgnu, @PathVariable("pgs") int pgs, @PathVariable("dname") String dname)
	{
		return dser.paginationAndsorting(pgnu,pgs,dname);
	}
	

	
	
	
		}
	





