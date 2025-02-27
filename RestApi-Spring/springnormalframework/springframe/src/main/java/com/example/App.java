package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new ClassPathXmlApplicationContext("Spring.xml");

        // Alien obj1 = (Alien)factory.getBean("alien");  // it create the object of alien 
        // obj1.code();
        // obj1.age =15;   // assigning the number 
        // System.out.println(obj1.age);   // printing


        
        // Alien obj2 = (Alien)factory.getBean("alien");  // it use the object created previously it is callled singleton beans 
        // obj2.code();
        // System.out.println(obj2.age);   // printing


        // by default it will be singloton in xml file that is the reason it will create object only one time 


        //<bean id="alien" class="com.example.Alien" scope="singleton"></bean>  

        //to create the object every time when we cwll the object we have to make thta singleton as prototype like below in xml file 
        
        //<bean id="alien" class="com.example.Alien" scope="prototype"></bean>



        // Alien obj1 = (Alien)factory.getBean("alien");  
        // obj1.code();
        // obj1.age =15;   
        // System.out.println(obj1.age);   


        
        // Alien obj2 = (Alien)factory.getBean("alien");  
        // obj2.code();
        // System.out.println(obj2.age);   


        // NOTE: the below we hae to make singleton in xml file 

        Alien obj1 = (Alien)factory.getBean("alien"); 
        obj1.code();

        // making the age value 10 by default we keep that at xml file 
        System.out.println(obj1.getAge());

    }
}
