package com.example.demo;

import com.example.demo.domain.Task;
import com.example.demo.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TaskManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
            taskService.save(new Task(1L,"Create spring app", LocalDate.now(), true));
            taskService.save(new Task(2L,"Completed app", LocalDate.now(), false));
            taskService.save(new Task(3L,"Tested app", LocalDate.now(), true));

        };
    }
}
