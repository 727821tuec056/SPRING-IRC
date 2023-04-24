package com.example.BloodBank.Service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	

}
