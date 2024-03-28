package africa.semicolon.com.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Document("posts")
public class Post {

    @Id
    private String id;
    private  String title;

    private String content;

    @DBRef
    private LocalDateTime dateCreated;
    @DBRef
    private List<View> view;

}
