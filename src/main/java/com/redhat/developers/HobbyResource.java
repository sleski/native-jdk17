package com.redhat.developers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/actions")
public class HobbyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello() {
        record Country(String name,String capital){}
        return new Country("Poland", "Warsaw");
    }
}
