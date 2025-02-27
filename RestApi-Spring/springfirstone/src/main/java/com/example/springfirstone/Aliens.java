package com.example.springfirstone;

public class Aliens {
    private int aid;
    private String aname;
    private int points;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    @Override
    public String toString() {
        return "Aliens [aid=" + aid + ", aname=" + aname + ", points=" + points + "]";
    }

    
}
