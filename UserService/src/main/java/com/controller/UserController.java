package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserService userService;
 // i cant access thiss url // so ask mushaf bhai //
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Integer userId)
    {

       User user =  this.userService.getUser(userId);
       //http://localhost:9002/contact/user/1311

        List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/1311" + user.getUserId(), List.class);
        user.setContacts(contacts);
        return user;

    }
}
