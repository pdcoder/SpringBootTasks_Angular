package com.example.demo.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private  Long id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate duedate;
    private boolean completed;

    public Task(long id, String name, LocalDate now, boolean b) {
        this.id = id;
        this.name = name;
        duedate = now;
        completed= b;
    }
}
