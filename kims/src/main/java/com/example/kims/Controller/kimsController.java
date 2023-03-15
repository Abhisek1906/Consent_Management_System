package com.example.kims.Controller;


import com.example.kims.Entity.EHR;
import com.example.kims.Entity.HospitalPatient;
import com.example.kims.Service.HospitalPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kims")
public class kimsController {

    @Autowired
    private HospitalPatientService hospitalPatientService;

    @PostMapping("/addPatientInHospital")
    public ResponseEntity<?> addPatientInHospital(@RequestBody HospitalPatient hospitalPatient){
        System.out.print(hospitalPatient.toString());
        if(hospitalPatientService.addPatient(hospitalPatient))
        {
            return ResponseEntity.ok("Success");
        }
        return ResponseEntity.status(400).body("Failed to Add Patient");
    }

    @PostMapping("/addEhrForPatient")
    public ResponseEntity<?> addEhrForPatient(@RequestBody EHR ehr){
        System.out.println(ehr.toString());
        if(hospitalPatientService.addEhrForPatient(ehr)){
            return ResponseEntity.ok("success");
        }
        return ResponseEntity.status(400).body("Failed to add EHR for the Patient");
    }
    @GetMapping("/getEHR/{patientId}")
    public ResponseEntity<List<EHR>> getEHR(@PathVariable("patientId") int patient){
        System.out.println("PatientId :"+ patient);
        List<EHR> ehrs=hospitalPatientService.getEHR(patient);
        if(ehrs.isEmpty())
            return ResponseEntity.status(400).body(null);
        return  ResponseEntity.ok().body(ehrs);
    }

}
