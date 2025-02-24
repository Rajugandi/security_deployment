package com.example.SecurityTutorial.controller;


import com.example.SecurityTutorial.model.Person;
import com.example.SecurityTutorial.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class ApiController {

    @Autowired
    PersonService personService;

    @GetMapping("/home")
    public String home(){
        return "This is HOME Page";
    }

    @GetMapping("/student")
    public String student(){
        return "This is STUDENT page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is Admin page";
    }


    @PostMapping("/signup")
    public String addPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }
}

