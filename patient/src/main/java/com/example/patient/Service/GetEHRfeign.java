package com.example.patient.Service;

import com.example.patient.Response.EhrResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="EHRList",url = "http://localhost:8081/cms")
public interface GetEHRfeign {
    @GetMapping("/getEHR/{abhaId}")
    List<EhrResponse> getEHR(@PathVariable("abhaId") int abhaId);
}
