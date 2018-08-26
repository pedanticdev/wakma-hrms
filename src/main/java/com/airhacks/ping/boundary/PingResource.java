package com.airhacks.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return "Hello, this is going to be exciting! Java EE 8 / Jakarta EE rocks!!!";
    }

}
