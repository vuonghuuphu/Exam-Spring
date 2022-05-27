package com.example.examjavaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/V1/cadidate")
public class CadidateApi {

    @Autowired
    CadidateService cadidateService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Candidate>> getlist() {
        return ResponseEntity.ok(cadidateService.findAll());
    }

    @PostMapping
    public ResponseEntity<Candidate> save(@RequestBody Candidate p) {
        return ResponseEntity.ok(cadidateService.save(p));
    }
}
