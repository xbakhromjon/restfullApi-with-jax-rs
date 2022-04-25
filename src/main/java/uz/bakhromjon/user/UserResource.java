package uz.bakhromjon.user;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import uz.bakhromjon.book.BookResource;
import uz.bakhromjon.exception.DataNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Path("api/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    public Long create(User user) {
        //...
        return user.getId();
    }

    @GET
    @Path("/{userId}")
    public User getUser(@BeanParam UserBeanParam beanParam) {
        List<User> users = new ArrayList<>();
        Integer start = beanParam.getPage() * beanParam.getSize() + 1;
        List<User> paganetedList = users.subList(start, start + beanParam.getSize());
        return new User();
    }


    @PUT
    @Path("/{userId}")
    public Response update(@PathParam("userId") String userId,
                           @Context HttpHeaders headers,
                           @Context UriInfo uriInfo) {
        return Response.status(401)
                .entity(new User())
                .location(uriInfo.getAbsolutePath())
                .build();
    }


    // using subResource
    @GET
    @Path("/{userId}/books")
    public BookResource getUserBooks(@PathParam("userId") Long userId) {
        return new BookResource();
    }

    // exception Handling
    @DELETE
    @Path("/{bookId}")
    public Response deleteBook(@PathParam("bookId") Long bookId) {
        if (bookId == null) {
            String msg = "Data not found with id" + bookId + " ";
            throw new DataNotFoundException(msg);
        }
        return Response.ok().build();
    }

}
