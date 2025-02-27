package com.example.springmvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlienRepo extends JpaRepository < Alien, Integer> {
    List<Alien> findByAname(String aname);  // Query DSL used to fetch the data using anme because this method is not present in the JpaRepository
    
    @Query("from Alien where aname= :name")
    List<Alien> find(@Param("name") String aname);
}
