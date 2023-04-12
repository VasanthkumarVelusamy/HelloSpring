package com.vasanth.hellospring;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    ArrayList<Task> tasks;

    public TasksController() {
        Task one = new Task("Do one thing", new Date(), false);
        Task two = new Task("Do another thing", new Date(), false);
        tasks = new ArrayList<>();
        tasks.add(one);
        tasks.add(two);
    }

    @GetMapping("hello")
    public String greet() {
        return "Hello world";
    }

    @GetMapping
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    // PathVariable mapping directlty to the parameter name.
    @GetMapping("{now}")
    public Task getTask(@PathVariable Integer now) {
        return tasks.get(now);
    }

    @PostMapping
    public ArrayList<Task> createTask(@Validated @RequestBody Task task) {
        tasks.add(task);
        return tasks;
    }

}
