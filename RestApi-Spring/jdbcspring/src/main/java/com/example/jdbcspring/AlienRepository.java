package com.example.jdbcspring;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepository extends CrudRepository<Alien, Integer>  // we have to extends it and enter the class we work with (Alien) and also we have enter the type of the primary key of our database(Integer)
{
    
}
