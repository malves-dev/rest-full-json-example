package com.malves.dev.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.malves.dev.model.VehiclePlate;

/**
 * 
 * @author MarioS
 *
 */
@Path("/json/vehicle/plate")
public class VehiclePlateService {
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public VehiclePlate getVehiclePlateInJSON() {
		VehiclePlate vehiclePlate = new VehiclePlate();
		vehiclePlate.setPlateNumber("EBH8675");
		vehiclePlate.setState("SP");

		return vehiclePlate;
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createVehiclePlateInJSON(VehiclePlate vehiclePlate) {
		String result = "Vehicle plate saved: " + vehiclePlate;
		return Response.status(201).entity(result).build();	
	}

}
