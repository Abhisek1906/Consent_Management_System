package com.example.cms.Service;

import com.example.cms.Response.EhrResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="EHRList",url = "http://localhost:9090/kims")
public interface GetEHRfeign {
    @GetMapping("/getEHR/{patientId}")
    List<EhrResponse> getEHR(@PathVariable("patientId") int patientId);
}
