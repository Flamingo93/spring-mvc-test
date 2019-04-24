package com.dqg.dpd.controller;

import com.dqg.dpd.dto.UserList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("list")
    public String listType(UserList userList){
            System.out.println(userList.getUsers());
        return userList.getUsers().toString();
    }
}
