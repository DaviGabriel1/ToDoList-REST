package br.org.davi.todolistwithrest.service;

import br.org.davi.todolistwithrest.exceptions.ResourceNotFoundException;
import br.org.davi.todolistwithrest.model.Task;
import br.org.davi.todolistwithrest.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public Task findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found"));
    }
    public List<Task> findAll(){
        return repository.findAll();
    }

    public Task create(Task task){
        return repository.save(task);
    }

    public Task update(Task task){
        var entity = repository.findById(task.getId()).orElseThrow(() -> new ResourceNotFoundException("task not found"));
        entity.setTitle(task.getTitle());
        entity.setDescription(task.getDescription());
        entity.setStatus(task.getStatus());
        return repository.save(entity);
    }
    public void delete(Long id){
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found"));
        repository.delete(entity);
    }
}
