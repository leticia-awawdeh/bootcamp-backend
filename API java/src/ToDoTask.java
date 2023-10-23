import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private boolean completed;

    public ToDoTask() {
    }

    public ToDoTask(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    // getters and setters
}
