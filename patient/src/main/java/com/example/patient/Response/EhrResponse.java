package com.example.patient.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EhrResponse{
    private int ehrId;

    private String hospitalName;

    private int hospitalId;

    private int doctorId;

    private String doctorName;

    private Date timeStamp;

    private String Diagnosis;

    private String medicine;


}
