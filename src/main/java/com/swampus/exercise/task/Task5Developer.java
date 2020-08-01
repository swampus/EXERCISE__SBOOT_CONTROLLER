package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.annotations.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * You have a method hi() that return get: "Hellow" and listening url: /task5/hi
 * Looks like very similar to Task0Junior but not working. Understand why not working and Fix.
 */
@RestController
@RequestMapping("/task5")
public class Task5Developer {

    @RequestMapping("/hi")
    public String hi() {
        return "Hellow";
    }
}
