package com.example.springfirstone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @RequestMapping("/hello")

    public List<Aliens> getaliens(){
        List<Aliens> aliens = new ArrayList<>();
        Aliens a1 = new Aliens();

        a1.setAid(101);
        a1.setAname("hello");
        a1.setPoints(40);

        Aliens a2 = new Aliens();

        a2.setAid(101);
        a2.setAname("hello");
        a2.setPoints(40);

        aliens.add(a1);
        aliens.add(a2);

        return aliens;
    }
}
