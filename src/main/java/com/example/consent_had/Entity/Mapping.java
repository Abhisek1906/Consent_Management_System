package com.example.consent_had.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mapping")
@Data
public class Mapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mapping_id;

    @Column(name="abha_Id",nullable = false)
    private int abhaId;

    @Column(name="hospitalId",nullable = false)
    private int hospitalId;

    @Column(name = "patientId",nullable = false)
    private int patientId;



}
