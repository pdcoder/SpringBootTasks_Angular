package com.example.demo.service;

import com.example.demo.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
