package com.example.consent_had.Controller;

import com.example.consent_had.Entity.Mapping;
import com.example.consent_had.Service.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mapping")
public class MappingController {

    @Autowired
    private MappingService mappingService;

    @PostMapping("/addMapping")
    public ResponseEntity<?> addMapping(@RequestBody Mapping mapping){
        if(mappingService.addMapping(mapping))
        {
            return ResponseEntity.ok("Success");
        }
        return ResponseEntity.status(400).body("Failed to Add Patient");
    }
}
