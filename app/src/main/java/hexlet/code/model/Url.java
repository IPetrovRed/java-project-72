package hexlet.code.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Url {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    //    private Timestamp createdAt;
    public Url(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }
}
