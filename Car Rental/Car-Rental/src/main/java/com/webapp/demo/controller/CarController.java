package com.webapp.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.CarRent.CarClass;
import com.webapp.demo.dao.CarDao;

@RestController
public class CarController {
	
	@Autowired
	CarDao dao;
	@RequestMapping("/saveCar")
	@ResponseBody
	public void saveCar(@RequestParam String cId,String cModel, String cNo,CarClass obj) {
		
		obj.setCardId(cId);
		obj.setCarModel(cModel);
		obj.setCarNo(cNo);
		obj.setStatus("available");
		dao.save(obj);
		
	}
	
	@RequestMapping("/editCar")
	@ResponseBody
	public void editCar(@RequestParam String cId,String cModel, String cNo) {
		
		
		dao.editCarDetails(cId,cModel,cNo);
		
	}
	
	@RequestMapping("/deleteCar")
	@ResponseBody
	public void deleteCar(@RequestParam String cId) {
		
		
		dao.deleteCar(cId);
		
	}
	

	@RequestMapping("/getAll")
	@ResponseBody
	public List<CarClass> getAll() {
		
		return dao.findAll();
		
		
	}
	
	@RequestMapping("/getById")
	@ResponseBody
	public List<CarClass> getCarById(String cId) {
		
		return dao.findById(cId);
		
		
	}

}