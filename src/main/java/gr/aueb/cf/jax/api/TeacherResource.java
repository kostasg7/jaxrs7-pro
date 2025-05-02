package gr.aueb.cf.jax.api;

import gr.aueb.cf.jax.dto.TeacherReadOnlyDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/teachers")
public class TeacherResource {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTeacher(@PathParam("id") Long id) {
        TeacherReadOnlyDTO dto = new TeacherReadOnlyDTO(id, "12345", "Αθανάσιος", "Ανδρούτσος");


        return Response.ok(dto).build();
//        return Response
//                .status(Response.Status.OK)
//                .entity(dto)
//                .build();
    }
}
