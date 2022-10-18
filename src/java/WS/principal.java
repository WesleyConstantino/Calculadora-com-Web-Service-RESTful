/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author x601533
 */
@Path("operacao")
public class principal {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of principal
     */
    public principal() {
    }


//Método para fazer operaçõeas de soma
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("soma/{N1}/{N2}")
    public String getSoma(@PathParam("N1") int n1, @PathParam("N2") int n2) {
        double som = n1 + n2;
        return "Soma "+ n1 +" + "+ n2 + " = " + som; 
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("subitracao/{N1}/{N2}")
    public String getSubitracao(@PathParam("N1") int n1, @PathParam("N2") int n2) {
        double sub = n1 - n2;
        return "Subitracao "+ n1 +" - "+ n2 + " = " + sub; 
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("multiplicacao/{N1}/{N2}")
    public String getMultiplicacao(@PathParam("N1") int n1, @PathParam("N2") int n2) {
        double mult = n1 * n2;
        return "Multiplicacao "+ n1 +" * "+ n2 + " = " + mult; 
    }
    
    @GET
    @Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    @Path("divisao/{N1}/{N2}")
    public String getDivisao(@PathParam("N1") int n1, @PathParam("N2") int n2) {
        double div = n1 / n2;
        return "Divisao "+ n1 +" / "+ n2 + " = " + div; 
    }

    /**
     * PUT method for updating or creating an instance of principal
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
