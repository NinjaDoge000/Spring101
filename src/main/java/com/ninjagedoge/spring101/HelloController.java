package com.ninjagedoge.spring101;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
    @GetMapping("/hello/{id}/")
    @ResponseStatus(HttpStatus.CREATED)
    String SayHello(@PathVariable int id, @RequestParam(required=false) String name) {
        System.out.println("Hi Dude, receive id: " + id);
        return name;
    }

    @PostMapping("/hello")
    void getHello(@RequestBody String resp) {
        System.out.println("Hi Dude; got " + resp);
    }
}
