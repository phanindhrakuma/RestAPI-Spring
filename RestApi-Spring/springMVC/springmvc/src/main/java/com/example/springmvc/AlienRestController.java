package com.example.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlienRestController {
    @Autowired
    AlienRepo repo;


    @GetMapping("RestApialiens")
    @ResponseBody  // usef to snd the data instead of the .jsp
    public List<Alien> getdata(){
        List<Alien> alien = repo.findAll();
        return alien;
    }
    @GetMapping("alien/{aid}")
    @ResponseBody  // usef to snd the data instead of the .jsp
    public Alien getdata(@PathVariable("aid") int aid){
        @SuppressWarnings("deprecation")
        Alien alienone = repo.getById(aid);
        return alienone;
    }

    @PostMapping("alien")
    public Alien adding(Alien alien){

        repo.save(alien);
        return alien;
    }
}
