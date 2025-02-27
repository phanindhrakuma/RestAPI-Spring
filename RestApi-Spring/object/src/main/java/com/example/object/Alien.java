package com.example.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired   // it will auutomatically inport the object of the class  use above the class 
    Laptop lap;

    public void code(){
        // System.out.println("i am coding");

        lap.compile();
    }
}
