package com.malves.dev.model;

import com.malves.dev.annotations.Plate;
import com.malves.dev.annotations.State;

/**
 * @author MarioS
 *
 */
public class VehiclePlate {
	
	@Plate
	private String plateNumber;
	
	@State
	private String state;

	/**
	 * @return the plateNumber
	 */
	public String getPlateNumber() {
		return plateNumber;
	}

	/**
	 * @param plateNumber the plateNumber to set
	 */
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
