package com.vasanth.hellospring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.MissingResourceException;

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
    public ArrayList<Task> createTask(@RequestBody Task task) {
        tasks.add(task);
        return tasks;
    }

    @PutMapping("{id}")
    public ArrayList<Task> replaceTask(@RequestBody Task task, @PathVariable int id) throws MissingResourceException {
        if (id < (tasks.size())) {
            tasks.remove(id);
            tasks.add(id, task);
            return tasks;
        } else {
            throw new MissingResourceException("sdfd", "sdfs", "sdfsd");
        }
    }

    @PatchMapping("{id}")
    public ArrayList<Task> updateTask(@PathVariable int id, @RequestBody Task task) {
        // TODO:- Only update the data from tasks at the given id tasks arrayList.
        return tasks;
    }

    @DeleteMapping("{id}")
    public ArrayList<Task> deleteTask(@PathVariable int id) {
        tasks.remove(id);
        return tasks;
    }

}
