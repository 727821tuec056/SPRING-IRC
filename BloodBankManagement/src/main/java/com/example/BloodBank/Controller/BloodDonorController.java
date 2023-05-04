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
import com.example.BloodBank.Repository.BloodDonorRepository;
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
	@GetMapping("sortDesce/{dgroup}")
	public List<BloodDonorModel> sortPersons(@PathVariable("dgroup")String dgroup)
	{
		return dser.sortDesce(dgroup);
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
	
	@Autowired
	public BloodDonorRepository bdr;
	
	@GetMapping("/bloodData")
	public List<BloodDonorModel> getD()
	{
		return bdr.getAllData();
	}
	@GetMapping("/byName/{id}")
	
	public List<BloodDonorModel> getName(@PathVariable("id")int did)
	{
		return bdr.bydname(did);
	}
	
	@GetMapping("/startend/{start}/{end}")
	public List<BloodDonorModel> statendId(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return bdr.startEnd(start,end);
	}
	
	@DeleteMapping("/deletebyid/{id}/{name}")
	public String deletePerson(@PathVariable("id")int id,@PathVariable("name") String name)
	{
		bdr.deleteId(id,name);
		return "deleted";
	}
	
	@PutMapping("/updatequery/{id}/{name}")
	public void updateByQuery(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		bdr.updateByQuery(id,name);
	}
	
	
	//JPQL queries
	@GetMapping("/jpqlget/{name}")
	public List<BloodDonorModel>getdetailname(@PathVariable ("name") String name)
	{
		return bdr.getjpqlname(name);
	}
	
	@GetMapping("/getbtw/{start}/{end}")
	public List<BloodDonorModel>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return bdr.getbtw(start,end);
	}
	
	@DeleteMapping("/deletejpql/{id}")
	public String deletejpqlid(@PathVariable("id") int id)
	{
		bdr.deletejpql(id);
		return "Deleted Sucessfully";
	}
	@PutMapping("update/{a}/{b}")
	public void updatejpql(@PathVariable("a") String a,@PathVariable("b")int b)
	{
		bdr.updateByQuery(a, b);
	}
	
	}

	





