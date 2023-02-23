package com.example.consent_had.Entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="patient")
@NoArgsConstructor
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

    public int getAbhaId() {
        return abhaId;
    }

    public void setAbhaId(int abhaId) {
        this.abhaId = abhaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Patient(String name, String email, long contact_no, String gender, int age) {
        this.name = name;
        this.email = email;
        this.contact_no = contact_no;
        this.gender = gender;
        this.age = age;
    }
}
