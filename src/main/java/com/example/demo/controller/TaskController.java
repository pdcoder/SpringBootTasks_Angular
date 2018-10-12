package com.example.demo.controller;




import com.example.demo.domain.Task;
import com.example.demo.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final Logger log = LoggerFactory.getLogger(TaskController.class);
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping( value = {"","/"})
    public Iterable<Task> listTasks() {
        return taskService.list();
    }

    @PostMapping( "/save" )
    public Task saveTask(@RequestBody Task task) {
        return taskService.save(task);
    }
}