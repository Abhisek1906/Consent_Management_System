package com.example.consent_had.Service;

import com.example.consent_had.Entity.EHR;
import com.example.consent_had.Entity.Patient;
import com.example.consent_had.Response.EhrResponse;

import java.util.List;

public interface PatientService {

    List<EHR> fetchEhrOfPatient(int id);

    boolean addPatient(Patient patient);
}
