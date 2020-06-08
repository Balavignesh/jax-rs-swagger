/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.franklin.cs.balasu05.gradebook.rest;

import io.swagger.v3.oas.annotations.servers.Server;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author BalaVignesh
 */
@Path("/customers")
public class Customer {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getCustomers() {
        return "To look up all Customers";
    }

}
