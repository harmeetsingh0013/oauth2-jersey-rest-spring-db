/**
 * 
 */
package com.the13star.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

/**
 * @author Harmeet Singh(Taara)
 *
 */

@Component
@Path(value="/")
public class RestServiceUsingJersey {

	@Path("/message")
	@GET
	public Response message() {
		return Response.status(Status.ACCEPTED).entity("Hello Jersy Rest Spring").build();
	}
}
