package com.example.jdbcspring;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // defining it is the rest api
public class AlienResource {


    // importing the AlienRepositry class object 
    @Autowired  // no need to enter the <     AlienRepository repo = new AlienRepository()    >   instead we use the @Autowird and create the name for the clas (repo)
    AlienRepository repo;

    @RequestMapping("/aliens")

    public List<Alien> getaliens(){
        List<Alien> aliens = (List<Alien>) repo.findAll();
        
        return aliens;
    }
}
