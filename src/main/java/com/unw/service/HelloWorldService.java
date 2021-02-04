package com.unw.service;

import com.unw.entity.Person;
import java.util.List;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;


@Component
@Path("/spring-docker/")
public class HelloWorldService {

  @GET
  @Path("/hello")
  public Response test() {
    return Response.status(200).entity("Rest Enpoint , Date 10.05.2019 - HELLO AWS Friends - V1.3").build();
  }

}
