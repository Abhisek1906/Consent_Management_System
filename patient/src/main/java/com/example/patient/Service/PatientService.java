package com.example.patient.Service;

import com.example.patient.Entity.Patient;
import com.example.patient.Response.EhrResponse;

import java.util.List;

public interface PatientService {
    boolean  addPatient(Patient patient);
    Patient getPatientInfo(int id);
    List<EhrResponse> getEhr(int abhaId);
}
