package com.asifsid88.microservice.expression;

import com.asifsid88.utilities.JSONUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("microservice/expression/v1")
public class ExpressionService {

    @GET
    @Produces("application/json")
    @Path("addmultiply/{a}/{b}")
    public Response expressionEvaluation(@PathParam("a") int a, @PathParam("b") int b) {

        // call add service
        // call multiply service

        long result = 100;
        return Response.status(200).entity(JSONUtils.toJSON(result)).build();
    }
}
