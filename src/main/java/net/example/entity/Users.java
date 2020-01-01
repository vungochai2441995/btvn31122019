package net.example.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="username",unique = true)
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="address")
    private String address;
}