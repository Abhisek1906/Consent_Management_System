package com.example.cms.Controller;

import com.example.cms.Response.EhrResponse;
import com.example.cms.Entity.Mapping;

import com.example.cms.Service.cmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cms")
public class cmsController {
    @Autowired
    private cmsService map;

    @GetMapping("/getEHR/{abhaId}")
    public ResponseEntity<List<EhrResponse>> getEHR(@PathVariable("abhaId") int Id)
        {
            System.out.println("abhaId  :"+Id);
            List<EhrResponse> temp=map.getEHR(Id);
            return ResponseEntity.ok(temp);
        }
    @PostMapping("/addMapping")
    public ResponseEntity<?> addMapping(@RequestBody Mapping mapping){
        System.out.println(mapping.toString());
        if(map.addMapping(mapping))
        {
            return ResponseEntity.ok("Success");
        }
        return ResponseEntity.status(400).body("Failed to Add Patient");
    }

}
