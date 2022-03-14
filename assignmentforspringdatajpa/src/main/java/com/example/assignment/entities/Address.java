package com.example.assignment.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private  String streetnumber;
    private String location;
    private  String state;

    public String getStreetnumber() {
        return streetnumber;
    }

    public void setStreetnumber(String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getstate() {
        return state;
    }

    public void setstate(String state) {
        this.state = state;
    }
}

