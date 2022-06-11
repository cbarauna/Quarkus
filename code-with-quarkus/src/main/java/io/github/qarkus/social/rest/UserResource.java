package io.github.qarkus.social.rest;


import io.github.qarkus.social.rest.dto.UserRequestDTO;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    @POST
    public Response creatUsers(UserRequestDTO userRequest) {
        return Response.ok().build();
    }
}
