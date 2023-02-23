package com.example.consent_had.Controller;

import com.example.consent_had.Entity.Hospital_patient;
import com.example.consent_had.Service.Hospital_PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital_patient")
public class Hospital_PatientController {

    @Autowired
    private Hospital_PatientService hospitalPatientService;

    @PostMapping("/addPatientInHospital")
    public ResponseEntity<?> addPatientInHospital(Hospital_patient hospitalPatient){
        if(hospitalPatientService.addPatient(hospitalPatient))
        {
            return ResponseEntity.ok("Success");
        }
        return ResponseEntity.status(400).body("Failed to Add Patient");
    }
}
