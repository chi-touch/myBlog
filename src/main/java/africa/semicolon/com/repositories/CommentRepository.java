package africa.semicolon.com.repositories;

import africa.semicolon.com.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {

}
