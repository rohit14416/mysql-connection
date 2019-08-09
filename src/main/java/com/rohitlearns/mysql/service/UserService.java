package com.rohitlearns.mysql.service;

import com.rohitlearns.mysql.model.User;
import com.rohitlearns.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getUserCredByUserId(int id) {
        User user = userRepository.findById(id);
        if(user != null) {
            String userId = user.getUserId();
            return userId;
        }
        return "";
    }

    public List<User> getAllInfo() {
        List<User> user = (List<User>) userRepository.findAll();
        List<User> newList = user.stream().filter(s -> s.getPwd().contains("pwd")).collect(Collectors.toList());
        return newList;

    }
}
