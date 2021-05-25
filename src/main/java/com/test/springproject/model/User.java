package com.test.springproject.model;

import javax.persistence.*;

@Entity(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "first_name")
    public String name;

    @Column(name = "last_name")
    public String surname;

    @Column(name = "account")
    public String account;
}