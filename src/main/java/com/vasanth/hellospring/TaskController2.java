package com.vasanth.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks")
public class TaskController2 {

    @GetMapping("helloworld")
    public String greetWorld() {
        return "Hello - world from controller 2";
    }
}
