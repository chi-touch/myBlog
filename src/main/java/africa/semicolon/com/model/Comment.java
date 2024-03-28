package africa.semicolon.com.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("comment")
public class Comment {

    @Id
    private String id;
    private User commentor;
    private String comment;
    private LocalDateTime timeOfComment;
}
