package com.exception.response.resources;

import com.exception.response.exception.DataNotExistException;
import com.exception.response.exception.InvalidDTOException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path(value = "/users")
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path(value = "/data/{id}")
    public Response getMessage(@PathParam("id") int id) throws DataNotExistException, InvalidDTOException {
        ArrayList<Integer> datas=new ArrayList<>();
        for(int i=0;i<500;i++)
            datas.add(i);
        if(id==0)
            throw new DataNotExistException("Data not exist ");
        else
            if(id==1)
                throw new InvalidDTOException("Bad Data provide by client");
            else
            return Response.status(Response.Status.OK).type(MediaType.APPLICATION_JSON).entity(datas).build();
    }
}
