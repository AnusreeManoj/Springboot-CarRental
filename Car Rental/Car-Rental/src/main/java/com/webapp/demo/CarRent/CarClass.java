package com.webapp.demo.CarRent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarClass {
	
	@Id
	private String carId;
	private String carModel;
	private String carNumber;
	private String carStatus;
	public String getCardId() {
		return carId;
	}
	public void setCardId(String carId) {
		this.carId = carId;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNo() {
		return carNumber;
	}
	public void setCarNo(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getStatus() {
		return carStatus;
	}
	public void setStatus(String carStatus) {
		this.carStatus = carStatus;
	}
	
	
	
}