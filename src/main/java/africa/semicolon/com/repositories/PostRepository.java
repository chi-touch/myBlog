package africa.semicolon.com.repositories;

import africa.semicolon.com.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
