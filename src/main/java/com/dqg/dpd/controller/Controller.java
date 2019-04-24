package com.dqg.dpd.controller;

import com.dqg.dpd.domain.User;
import com.dqg.dpd.dto.UserList;
import com.dqg.dpd.dto.UserMap;
import com.dqg.dpd.dto.UserSet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("list")
    public String listType(UserList userList) {
        return userList.getUsers().toString();
    }

    @GetMapping("set")
    public String setType(UserSet userSet) {
        userSet.getUsers().forEach(user -> System.out.println(user.getName()));
        return userSet.getUsers().toString();
    }

    @GetMapping("map")
    public String mapType(UserMap userMap) {
        return userMap.getUsers().toString();
    }
}
