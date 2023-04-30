package com.tech.techcareerSpringBoot1.repository;
import com.tech.techcareerSpringBoot1.data.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends MongoRepository <Book,String>{
    Optional<Book> findByAuthorID (String authorID);
}
