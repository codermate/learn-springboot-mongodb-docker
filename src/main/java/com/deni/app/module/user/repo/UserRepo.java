package com.deni.app.module.user.repo;



import com.deni.app.module.user.collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends MongoRepository<User, Integer> {
    // SQL Equivalent : SELECT * FROM Book where author = ? and cost=?
    //@Query("{$and :[{author: ?0},{cost: ?1}] }")
    @Query("{username: ?0}")
    User findByUsername(String username);

}
