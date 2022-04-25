package uz.bakhromjon.user;

import jakarta.ws.rs.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserBeanParam {
    private @PathParam("userId") Long userId;
    private @MatrixParam("a") String a;
    private @QueryParam("year") String year;
    private @HeaderParam("token") String token;
    private @CookieParam("p") String p;
    private @QueryParam("page") Integer page;
    private @QueryParam("size") Integer size;
}
