package africa.semicolon.com.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document("User")

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    @Id
    private String id;

    @DBRef
    private List<Post> post;
}
