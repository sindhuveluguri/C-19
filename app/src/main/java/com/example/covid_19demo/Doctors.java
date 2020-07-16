package com.example.covid_19demo;

public class Doctors {
    String Name;
    Long Phone;

    public Doctors() {
    }

    public Doctors(String Name,Long Phone)
    {
        this.Name = Name;
        this.Phone = Phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getPhone() {
        return Phone;
    }

    public void setPhone(Long phone) {
        Phone = phone;
    }
}
