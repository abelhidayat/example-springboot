package com.abel.springbootexample.examplespringboot.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;
}
