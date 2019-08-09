package com.rohitlearns.mysql;

import com.rohitlearns.mysql.model.User;
import com.rohitlearns.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value="/userInfo")
    public String getInfo() {
        return "Hello User";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/tstInfo/{id}")
    public String getUserCreds(@PathVariable("id") int id) {
        String userId = userService.getUserCredByUserId(id);
        return userId;
    }

    @RequestMapping(method=RequestMethod.GET,value="/allInfo")
    public List<User> allInfo() {
        List<User> userList = userService.getAllInfo();
        return userList;
    }
}
