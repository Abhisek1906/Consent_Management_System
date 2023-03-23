package com.example.patient.Controller;

import com.example.patient.Entity.Patient;
import com.example.patient.Request.LoginRequest;
import com.example.patient.Response.AuthenticationResponse;
import com.example.patient.Response.EhrResponse;
import com.example.patient.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginRequest credentials){
        System.out.println(credentials.toString());
        System.out.println("aksjdfhkasjdfhkajsdhfksajdhfksjadhfkjashfdkjsadhfkjsahfdkjsadhfkjsahdfkjdsfjhdfsafdasdfdsf");
        //return ResponseEntity.ok(authService.authenticate(credentials));
        return ResponseEntity.ok(new AuthenticationResponse());

    }

    @GetMapping("/getEhr/{abhaId}")
    public ResponseEntity<List<EhrResponse>> getEhrByPatientId(@PathVariable("abhaId") int abhaId){
        List<EhrResponse> ehrList=patientService.getEhr(abhaId);
        if(ehrList.isEmpty())
            return ResponseEntity.status(400).body(null);

        return ResponseEntity.ok(ehrList);
    }
    @GetMapping("/getPatientInfo/{patientId}")
    public ResponseEntity<Patient> getPatientInformation(@PathVariable("patientId") int id){
        return ResponseEntity.ok(patientService.getPatientInfo(id));

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
