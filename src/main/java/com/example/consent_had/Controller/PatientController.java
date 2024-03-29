package com.example.consent_had.Controller;

import com.example.consent_had.Entity.EHR;
import com.example.consent_had.Entity.Patient;
import com.example.consent_had.Response.EhrResponse;
import com.example.consent_had.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/getEhr/{patientId}")
    public ResponseEntity<List<EhrResponse>> getEhrByPatientId(@PathVariable("patientId") int id){
        List<EhrResponse> getEhrResponse=patientService.fetchEhrOfPatient(id);
        return ResponseEntity.ok(getEhrResponse);
    }

    @PostMapping("/addPatient")
    public ResponseEntity<?> addPatient(@RequestBody Patient patient){
        if(patientService.addPatient(patient))
        {
            return ResponseEntity.ok("Success");
        }
        return ResponseEntity.status(400).body("Failed to Add Patient");
    }
}
