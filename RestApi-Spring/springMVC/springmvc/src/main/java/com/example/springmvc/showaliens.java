package com.example.springmvc;

public class showaliens {
    private int aid;
    private String aname;

    public showaliens(){
        
    }

    public showaliens(int aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }
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
    @Override
    public String toString() {
        return "model [aid=" + aid + ", aname=" + aname + "]";
    }

}
