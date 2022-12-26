package com.users.user.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.user.entity.User;
import com.users.user.entity.UserRole;
import com.users.user.services.UserService;
@RestController
@RequestMapping("")
public class UserController {
UserService userService;
    public UserController(UserService userService) {
        super();
        this.userService=userService;
    }
    @GetMapping("/userselect/{id}")
    public User getById(@PathVariable int id)
    {
        return this.userService.getById(id);
    }   
    @GetMapping("/userselectall")
    public List<UserRole> getAll()
    {
     return this.userService.getAll();  
    }
    @PostMapping("/userinsert")
    public boolean usercreate(@RequestBody User user)
    {

        return this.userService.userCreate(user);
    }
    @PutMapping("/userupdate")
    public boolean updateUser(@RequestBody User user)
    {
        // System.out.println(user.first_name) ;

        return this.userService.updateUser(user);
    }
    @DeleteMapping("/userdelete/{id}")
    public void deleteById(@PathVariable int id)
    {
         this.userService.deleteById(id);
    }

}

