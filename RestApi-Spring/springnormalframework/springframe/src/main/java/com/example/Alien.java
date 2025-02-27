package com.example;

public class Alien {

    private int age;
    // private Laptop laptop;
    private Computer com;
    
    public Alien(){
        System.out.println("creating the object alien ...");
    }

    
    // public Alien(int age) {   // constructor we assigning the valkue with constructor  while useing it comment the above cionstructor and commint the xml file property age tag 
    //     this.age = age;
    // }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // public Laptop getLaptop() {
    //     return laptop;
    // }
    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }
    

    public Computer getCom() {
        return com;
    }


    public void setCom(Computer com) {
        this.com = com;
    }
    
    public void code(){
        System.out.println("i am coding...");
        // laptop.compile();
        com.compile();
    }


    
    
    
}
