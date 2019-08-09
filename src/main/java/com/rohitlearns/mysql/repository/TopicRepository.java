package com.rohitlearns.mysql.repository;

import com.rohitlearns.mysql.model.Topic;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("topicRepository")
public interface TopicRepository extends CrudRepository<Topic,String> {

    //String deleteById(String name);

}
