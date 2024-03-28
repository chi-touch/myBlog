package africa.semicolon.com.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface User extends MongoRepository<User,String> {
}
