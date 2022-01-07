package com.exception.response.exception.handler;

import com.exception.response.dto.ExceptionResponseDTO;
import com.exception.response.exception.DataNotExistException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * using different class throw exception and respond to client
 */
public class ExceptionHandler implements ExceptionMapper<DataNotExistException> {
    @Override
    public Response toResponse(DataNotExistException e) {
        System.err.println("Hey executed");
        ExceptionResponseDTO exceptionResponseDTO=new ExceptionResponseDTO(451,e.getMessage());
        return Response.status(Response.Status.OK).entity(exceptionResponseDTO).build();
    }
}
