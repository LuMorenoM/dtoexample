package com.dtoexample.dtoexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
}
