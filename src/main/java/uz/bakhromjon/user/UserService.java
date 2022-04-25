package uz.bakhromjon.user;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
    public User getAllUsers() {
        User user = new User();
        user.setBirthCountry("Uzb");
        user.setBirthCountryId(1L);
        user.setCitizenship("Uzb");
        user.setDocument("AC121212");
        user.setBirthPlace("namanagan");
        user.setEmail("email1@gmail.com");
        User user1 = new User();
        user1.setBirthCountry("Uzb");
        user1.setBirthCountryId(1L);
        user1.setCitizenship("Uzb");
        user1.setDocument("AC121212");
        user1.setBirthPlace("namanagan");
        user1.setEmail("email1@gmail.com");
        user.setEmail("email1@gmail.com");
        User user2 = new User();
        user2.setBirthCountry("Uzb");
        user2.setBirthCountryId(1L);
        user2.setCitizenship("Uzb");
        user2.setDocument("AC121212");
        user2.setBirthPlace("namanagan");
        user2.setEmail("email1@gmail.com");
        ArrayList<User> users = new ArrayList<>(Arrays.asList(user, user1, user2));
        return user;
    }
}
