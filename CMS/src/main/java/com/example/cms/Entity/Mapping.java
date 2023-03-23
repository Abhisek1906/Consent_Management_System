package com.example.cms.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="mapping")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mapping_id;

    @Column(name = "abhaId", nullable = false)
    private int abhaId;

    @Column(name = "hospitalId", nullable = false)
    private int hospitalId;

    @Column(name = "patientId", nullable = false)
    private int patientId;


}