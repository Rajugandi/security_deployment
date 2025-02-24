package com.example.SecurityTutorial.service;


import com.example.SecurityTutorial.model.Person;
import com.example.SecurityTutorial.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepo personRepo;

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String savePerson(Person person){
        person.setPassWord(passwordEncoder.encode(person.getPassWord()));
        person.setRoles("STUDENT");

        personRepo.save(person);
        return "Person saved";

    }
}
