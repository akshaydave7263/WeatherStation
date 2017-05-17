package com.dave.rest;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dave.model.Profile;
import com.dave.service.ProfileService;

@Path("profiles")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class ProfileResource {

	private ProfileService p1 =new ProfileService();
	
	@GET
	public List<Profile> getProfiles()
	{
		System.out.println("in get");
		return p1.getAllProfiles();
	}
	
	@POST
	@Path("/hello")
	public String Message()
	{
		return  "heeelllo";
	}
	
    @POST
	   public Profile addProfile(Profile profile)
	   {
		return p1.addProfile(profile);
		   
	   }
	 
	 @GET
	 @Path("/{profileName}")
	 public Profile getProfile(@PathParam("profileName") String profileName)
	   {
		return p1.getProfile(profileName);   
	   }
	 
	 @PUT
	   @Path("/{profileName}")
	   public Profile updateprofile(@PathParam("profileName") String profileName,Profile profile)
	   { 
		   profile.setProfileName(profileName);
		   return p1.updateProfile(profile);
	   }
	
	 @DELETE
	  @Path("/{profileName}")
	   public void deleteProfile(@PathParam("profileName") String profileName)
	   {
		   p1.removeProfile(profileName);
		
		   
	   }
}
