package br.org.davi.todolistwithrest.controllers;

import br.org.davi.todolistwithrest.model.Task;
import br.org.davi.todolistwithrest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> findAll(){
        return taskService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Task findById(@PathVariable Long id){
        return taskService.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                consumes = MediaType.APPLICATION_JSON_VALUE)
    public Task create(@RequestBody Task task){
        return taskService.create(task);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                consumes = MediaType.APPLICATION_JSON_VALUE)
    public Task update(@RequestBody Task task){
        return taskService.update(task);
    }

    @DeleteMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        taskService.delete(id);
    }
}
