package com.malves.dev.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.malves.dev.model.Artist;

/**
 * 
 * @author MarioS
 *
 */
@Path("/json/metallica")
public class ArtistService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Artist getArtistInJSON() {
		Artist artist = new Artist();
		artist.setTitle("Enter Sandman");
		artist.setName("Metallica");

		return artist;
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createArtistInJSON(Artist artist) {
		String result = "Artist saved: " + artist;
		return Response.status(201).entity(result).build();	
	}
	
}