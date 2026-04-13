package com.liquibase.Example.liquibase.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data // Generates getters, setters, and constructors via Lombok
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Remove firstName and lastName
    // Add this:
    private String fullName;
    private String email;

    // Add this line
    private String phoneNumber;
}
