package com.example.demo002.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
     @Column(name = "name")
    private  String name;
     @Column(name = "email")
     private  String email;
     @Column(name = "phone")
    private  String phone;
     public User(){
     }
     public Long getId(){return  id;}
     public void setId(Long id){this.id = id;}
     public  String getName(){return name;}
     public void setName(String name){this.name = name;}
     public  String getEmail() { return email;}
     public void setEmail(String email){this.email = email;}
}
