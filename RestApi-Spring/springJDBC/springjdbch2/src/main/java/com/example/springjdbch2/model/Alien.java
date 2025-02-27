package com.example.springjdbch2.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // the component will only manage al the things like object creating and all 
@Scope("prototype")  // this willl help it will not create the object everytime when we import the class we can use it for multiple purpose 
public class Alien {
    private int id;
    private String name;
    private String tech;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }
    @Override
    public String toString() {
        return "Alien [id=" + id + ", name=" + name + ", tech=" + tech + "]";
    }

    
}
