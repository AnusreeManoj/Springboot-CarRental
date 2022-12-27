package com.webapp.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.webapp.demo.CarRent.CarClass;

import jakarta.transaction.Transactional;

public interface CarDao extends JpaRepository<CarClass, Integer>{
	
	@Modifying
	@Transactional
	@Query(value="update car set car_model=?2,car_number=?3,status='booked' where car_Id=?1",nativeQuery = true)
	public void editCarDetails(String cId,String cModel,String cNo);
	
	@Modifying
	@Transactional
	@Query(value="delete from car where car_id=?1",nativeQuery = true)
	public void deleteCar(String cId);
	
	@Query(value="select * from car where car_id=?1",nativeQuery = true)
	public List<CarClass> findById(String cId);

}