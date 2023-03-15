package com.example.patient.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Table(name="patient")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient{

    @Id
    @Column(name="abhaId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int abhaId;

    @Column(name = "name")
    private String name;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;

    @Column(name="contact_no")
    private long contact_no;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private int age;



}
