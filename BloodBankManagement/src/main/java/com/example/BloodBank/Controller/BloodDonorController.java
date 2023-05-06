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

import io.swagger.v3.oas.annotations.tags.Tag;



@RestController
public class BloodDonorController {
     
	@Autowired
	public BloodDonorService dser;
	//posting details
	@Tag(name="Post",description="Posting the details")
	@PostMapping("/blood")
	public BloodDonorModel addDetails(@RequestBody BloodDonorModel dr)
	{
		return dser.saveinfo(dr);
	}
	
	//deleting details  
	@Tag(name="Delete",description="Delete the given details")
	@DeleteMapping("/blood/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		dser.deletedetails(id);
		return "Deleted successfully";
	}
	
	//getting details
	@Tag(name="Get",description="Getting the given details")
	@GetMapping("/blood/{id}")
	public Optional<BloodDonorModel> getdetails(@PathVariable("id")int id)
	{
		return dser.getdetails(id);
	}
	
	//updating details
	@Tag(name="Update",description="Updating the given details")
	@PutMapping("/update")
	public BloodDonorModel updatedetails(@RequestBody BloodDonorModel id)
	{
		return dser.updatedetails(id);
	}
	
	//sort by ascending order
	@Tag(name="SortAsce",description ="Sorting the given details in ascending order")
	@GetMapping("sortAsce/{dname}")
	public List<BloodDonorModel> sortPerson(@PathVariable("dname") String dname)
	{
		
		return dser.sortAsce(dname);
	}
	
	//sort by descending order
	@Tag(name="SortDesc",description ="Sorting the given details in descending order")
	@GetMapping("sortDesce/{dgroup}")
	public List<BloodDonorModel> sortPersons(@PathVariable("dgroup")String dgroup)
	{
		return dser.sortDesce(dgroup);
	}
	
	//pagination
	@Tag(name="Pagination",description ="Pagination of data")
	@GetMapping("/pagination/{pgnu}/{pgs}")
	public List<BloodDonorModel> paginationData(@PathVariable("pgnu")int pgnu,@PathVariable("pgs")int pgs)
	{
		return dser.paginationData(pgnu,pgs);
	}
	
	//pagination and sorting
	@Tag(name="Pagination and Sorting",description ="Pagination and Sorting the data")
	@GetMapping("/paginationsorting/{pgnu}/{pgs}/{dname}")
	public List<BloodDonorModel> paginationSorting(@PathVariable("pgnu") int pgnu, @PathVariable("pgs") int pgs, @PathVariable("dname") String dname)
	{
		return dser.paginationAndsorting(pgnu,pgs,dname);
	}
	
	@Autowired
	public BloodDonorRepository bdr;
	@Tag(name="Get Data native query",description ="Getting the given details")
	@GetMapping("/bloodData")
	public List<BloodDonorModel> getD()
	{
		return bdr.getAllData();
	}
	
	
	@GetMapping("/byName/{id}")
	@Tag(name="Get Data by name native query",description ="Getting the given details")
	public List<BloodDonorModel> getName(@PathVariable("id")int did)
	{
		return bdr.bydname(did);
	}
	
	
	@GetMapping("/startend/{start}/{end}")
	@Tag(name="Get Data by Startend native query",description ="Getting the given details")
	public List<BloodDonorModel> statendId(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return bdr.startEnd(start,end);
	}
	
	
	@DeleteMapping("/deletebyid/{id}/{name}")
	@Tag(name="DeleteId Data native query",description ="Deleting the given details")
	public String deletePerson(@PathVariable("id")int id,@PathVariable("name") String name)
	{
		bdr.deleteId(id,name);
		return "deleted";
	}
	
	
	@PutMapping("/updatequery/{id}/{name}")
	@Tag(name="update Data native query",description ="Updating the given details")
	public void updateByQuery(@PathVariable("id") int id,@PathVariable("name") String name)
	{
		bdr.updateByQuery(id,name);
	}
	
	
	//JPQL queries
	@GetMapping("/jpqlget/{name}")
	@Tag(name="Get Data  by name jpqlquery",description ="Getting the given details")
	public List<BloodDonorModel>getdetailname(@PathVariable ("name") String name)
	{
		return bdr.getjpqlname(name);
	}
	
	
	@GetMapping("/getbtw/{start}/{end}")
	@Tag(name="Get Data by stratend jpqlquery",description ="Getting the given details")
	public List<BloodDonorModel>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return bdr.getbtw(start,end);
	}
	
	
	@DeleteMapping("/deletejpql/{id}")
	@Tag(name="Delete Data jpqlquery",description ="Deleting the given details")
	public String deletejpqlid(@PathVariable("id") int id)
	{
		bdr.deletejpql(id);
		return "Deleted Sucessfully";
	}
	
	
	@PutMapping("update/{a}/{b}")
	@Tag(name="Update Data jpqlquery",description ="Updating the given details")
	public void updatejpql(@PathVariable("a") String a,@PathVariable("b")int b)
	{
		bdr.updateByQuery(a, b);
	}
	
	}

	





