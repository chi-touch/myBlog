package africa.semicolon.com.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface View extends MongoRepository<View,String> {
}
