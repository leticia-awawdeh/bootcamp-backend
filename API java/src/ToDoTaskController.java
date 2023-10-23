import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class ToDoTaskController {
    @Autowired
    private ToDoTaskRepository taskRepository;

    @GetMapping
    public List<ToDoTask> getAllTasks() {
        return (List<ToDoTask>) taskRepository.findAll();
    }

    @PostMapping
    public ToDoTask addTask(@RequestBody ToDoTask task) {
        return taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public ToDoTask updateTask(@PathVariable Long id, @RequestBody ToDoTask updatedTask) {
        ToDoTask task = taskRepository.findById(id).orElse(null);
        if (task != null) {
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            return taskRepository.save(task);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }
}
