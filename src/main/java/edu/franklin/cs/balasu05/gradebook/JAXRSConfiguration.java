package edu.franklin.cs.balasu05.gradebook;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Configures JAX-RS for the application.
 * @author Juneau
 */
@OpenAPIDefinition(servers = @Server(url="/jax-rs-swagger"),info = @Info(title = "jax-rs-swagger",version = "1.0",
        contact = @Contact(
            name = "jax-rs-swagger",
            email = "balasu05@email.franklin.edu")))
@ApplicationPath("services")
public class JAXRSConfiguration extends Application {
    
 
}
