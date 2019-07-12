package pl.nogacz.tasks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.nogacz.tasks.domain.Task;
import pl.nogacz.tasks.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Dawid Nogacz on 10.07.2019
 */
@Service
public class DbService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTask(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
}
