package com.exception.response.exception.handler;

import com.exception.response.exception.InvalidDTOException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ExceptionHandler1 implements ExceptionMapper<InvalidDTOException> {
    @Override
    public Response toResponse(InvalidDTOException e) {
        return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).type(MediaType.APPLICATION_JSON_TYPE).build();
    }
}
