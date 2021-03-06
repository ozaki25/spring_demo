package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String fullname;

    public Demo() {

    }

    public Demo(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Demo(String firstname, String lastname, String fullname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fullname = fullname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "id: " + this.getId() + ", lastname: " + this.getLastname() + ", firstname: " + this.getFirstname()
                + ", fullname: " + this.getFullname();
    }
}