package africa.semicolon.com.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class View {
    private LocalDateTime timeOfView;
    private User viewer;

    @Id
    private String id;
}
