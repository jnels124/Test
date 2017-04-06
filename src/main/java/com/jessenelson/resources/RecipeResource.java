package com.jessenelson.resources;

//import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by jessenelson on 4/1/17.
 */
//@Component
@Path("/recipe")
public class RecipeResource {
    @GET
//    @Path("/{id}")/
//    @Produces("text/plain")
    @Produces(MediaType.TEXT_PLAIN)
    public String getRecipe() {
//    public String getRecipe(@PathParam("id") String recipeId) {
        System.out.print("What the fuck");
        return "All Good in the Hood + id";
//        return Response.ok("All Good in the Hood + id" + recipeId).build();
    }
}
