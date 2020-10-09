package com.TutorialsPoint.UserProfile.Resource;

import com.TutorialsPoint.UserProfile.model.UserProfile;
import com.TutorialsPoint.UserProfile.service.ProfileService;

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

@Path("/Profile")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)

public class ProfileResource {
   ProfileService messageService = new ProfileService();
   
   @GET
   public List<UserProfile> getProfile() {
      return messageService.getAllProfile();
   }

   @GET
   @Path("/{ProID}")
   public UserProfile getProfile(@PathParam("ProID")long Id) {
      return messageService.getProfile(Id);
   }

   @POST
   public UserProfile addProfile(UserProfile profile) {
      return messageService.addProfile(profile);
   }

   @PUT
   @Path("/{proID}")
   public UserProfile UpdateProfile(@PathParam("proID")long Id,UserProfile UserProfile) {
      UserProfile.setProId(Id);
      return messageService.UpdateProfile(UserProfile);
   }
   
   @DELETE
   @Path("/{ProID}")
   public void deleteProfile(@PathParam("ProID")long Id) {
      messageService.RemoveProfile(Id);
   }
}