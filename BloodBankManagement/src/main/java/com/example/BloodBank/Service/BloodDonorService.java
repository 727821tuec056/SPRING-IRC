package com.example.BloodBank.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.BloodBank.Model.BloodDonorModel;
import com.example.BloodBank.Repository.BloodDonorRepository;

@Service
public class BloodDonorService {
 @Autowired
	public BloodDonorRepository crepo;

public BloodDonorModel saveinfo(BloodDonorModel dr) {
	// TODO Auto-generated method stub
	return crepo.save(dr);
}

public void deletedetails(int id) {
	// TODO Auto-generated method stub
	crepo.deleteById(id);
}

public Optional<BloodDonorModel> getdetails(int id) {
	// TODO Auto-generated method stub
	return crepo.findById(id);
}

public BloodDonorModel updatedetails(BloodDonorModel id) {
	// TODO Auto-generated method stub
	return crepo.saveAndFlush(id);
}
	
	//sorting ascending order
public List <BloodDonorModel> sortAsce(String dname)
{
	return crepo.findAll(Sort.by(dname).ascending());
}
	//sort descending order
public List <BloodDonorModel> sortDesce(String dname)
{
	return crepo.findAll(Sort.by(dname).descending());
}

public List<BloodDonorModel> paginationData(int pgnu, int pgs) {
	// TODO Auto-generated method stub
	Page<BloodDonorModel> p=crepo.findAll(PageRequest.of(pgnu, pgs));
	return p.getContent();
}

public List<BloodDonorModel> paginationAndsorting(int pgnu, int pgs, String dname) {
	// TODO Auto-generated method stub
	Page<BloodDonorModel> p=crepo.findAll(PageRequest.of(pgnu, pgs,Sort.by(dname).descending()));
	return p.getContent();
}

 
	

}
