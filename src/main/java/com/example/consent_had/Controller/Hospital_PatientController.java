package com.example.consent_had.Controller;

import com.example.consent_had.Entity.EHR;
import com.example.consent_had.Entity.Hospital_patient;
import com.example.consent_had.Service.Hospital_PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital_patient")
public class Hospital_PatientController {

    @Autowired
    private Hospital_PatientService hospitalPatientService;

    @PostMapping("/addPatientInHospital")
    public ResponseEntity<?> addPatientInHospital(@RequestBody Hospital_patient hospitalPatient){
        System.out.print(hospitalPatient.getHid());
        if(hospitalPatientService.addPatient(hospitalPatient))
        {
            return ResponseEntity.ok("Success");
        }
        return ResponseEntity.status(400).body("Failed to Add Patient");
    }

    @PostMapping("/addEhrForPatient")
    public ResponseEntity<?> addEhrForPatient(@RequestBody EHR ehr){
        System.out.println(ehr.getEhr_id()+" "+ehr.getDoctorId());
        if(hospitalPatientService.addEhrForPatient(ehr)){
            return ResponseEntity.ok("success");
        }
        return ResponseEntity.status(400).body("Failed to add EHR for the Patient");
    }
}
