package com.example.BloodBank.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.BloodBank.Model.BloodDonorModel;

import jakarta.transaction.Transactional;

public interface BloodDonorRepository extends JpaRepository<BloodDonorModel,Integer> {
	
	
	
	
	
//native query
	@Query(value="Select * from blooddonor", nativeQuery = true)
	public List<BloodDonorModel> getAllData();
    
	@Query(value="select * from blooddonor where did=:id",nativeQuery =true)
	public List<BloodDonorModel> bydname(@Param ("id") int did);
	
	@Query(value="select * from blooddonor where did between ?1 and  ?2" ,nativeQuery=true)
	public List<BloodDonorModel> startEnd(@Param("start") int start ,@Param("end")int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from blooddonor where did=?1 and dname=?2" ,nativeQuery=true)
	Integer deleteId(@Param ("id") int did,@Param ("name") String dname);

	

	@Modifying
	@Transactional
	@Query(value="update blooddonor set did=:id where dname=:name",nativeQuery=true)
	public void updateByQuery(@Param("id")int id,@Param("name") String name);

	//JPQL queries
	
	@Query("select d from BloodDonorModel d where dname=?1")
	public List<BloodDonorModel> getjpqlname(String name);

	
	@Query("select d from BloodDonorModel d where id between ?1 and ?2")
	public List<BloodDonorModel> getbtw(int start, int end);

	
	@Modifying
	@Transactional
	@Query("delete from BloodDonorModel where id=?1")
	public void deletejpql(int id);

	@Modifying
	@Transactional
	@Query("update BloodDonorModel set ddonationno =?1 where id=?2")
	public void updateByQuery(String a, int b);
	
	

	
	
	
		
	

	
}
