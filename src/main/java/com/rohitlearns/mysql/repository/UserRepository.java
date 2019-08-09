package com.rohitlearns.mysql.repository;

import com.rohitlearns.mysql.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    User findById(int id);

   // List<User> findAllByUs
}
