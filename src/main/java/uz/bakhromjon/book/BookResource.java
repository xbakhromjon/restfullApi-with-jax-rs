package uz.bakhromjon.book;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import uz.bakhromjon.user.User;

import java.util.ArrayList;
import java.util.List;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getBooks() {
        return new ArrayList<>();
    }

    @POST
    public Long createBook(User user) {
        return 1L;
    }
}
