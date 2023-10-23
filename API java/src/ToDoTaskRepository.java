import org.springframework.data.repository.CrudRepository;

public interface ToDoTaskRepository extends CrudRepository<ToDoTask, Long> {
}
