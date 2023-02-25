package com.example.consent_had.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="patient")
@Data
public class Patient {

    @Id
    @Column(name="abhaId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int abhaId;

    @Column(name = "name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="contact_no")
    private long contact_no;

    @Column(name="gender")
    private String gender;

    @Column(name="age")
    private int age;


}
