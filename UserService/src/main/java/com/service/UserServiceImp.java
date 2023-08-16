package com.service;

import com.entity.Contact;
import com.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    //creating user List //
    List<User> list = List.of(
            new User(12, "dasdasads", "Dasdasdasd",
                    List.of(new Contact(12, "SDasd", "asdas",12))),
            new User(123, "dasdasads", "Dasdasdasd",
                    List.of(new Contact(12, "SDasd", "asdas",12))),
            new User(123, "dasdasads", "Dasdasdasd",
                    List.of(new Contact(12, "SDasd", "asdas",12)))
    );

    @Override
    public User getUser(Integer id) {
        return this.list.stream()
                .filter(user -> user.getUserId().equals(id))
                .findAny()
                .orElse(null);
    }
}
