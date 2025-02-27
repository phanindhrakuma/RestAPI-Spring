package com.example.springjdbch2.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.springjdbch2.model.Alien;

@Repository
public class AlienRepo {


    private JdbcTemplate template;   // this will  directly connect the database 

    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired  
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien){

        String sql = "insert into alien (id, name, tech) values (?,?,?)";
        int rows = template.update(sql, alien.getId(),alien.getName(),alien.getTech());
        System.out.println(rows+ " rows effected ");
    }

    public List<Alien> findall(){
        String sql = "select * from alien";
        // RowMapper<Alien> mapper = new RowMapper<Alien>() {  // the reason we will use the maprow is it will fetch the data one by one .

        //     @Override
        //     public Alien mapRow(ResultSet rs, int rownum) throws SQLException {
        //         Alien a = new Alien(); // it is the empty object

        //         a.setId(rs.getInt(1));
        //         a.setName(rs.getString(2));
        //         a.setTech(rs.getString(3));

        //         return a;
        //     }
            
        // };


        // since it is the functional interface we can use the lamda expression 
        RowMapper<Alien> mapper = (rs, rownum) -> {
                Alien a = new Alien(); // it is the empty object

                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setTech(rs.getString(3));

                return a;
            
        };


        List<Alien> aliens= template.query(sql, mapper);

        return aliens;
    }

    
}
