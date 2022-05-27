package com.example.examjavaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CadidateService {
    @Autowired
    CandidateRepository candidateRepository;

    public List<Candidate> findAll() {
        return candidateRepository.findAll();
    }

    public Optional<Candidate> findById(int id) {
        return candidateRepository.findById(id);
    }

    public Candidate save(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public void deleteById(int id) {candidateRepository.deleteById(id); }

}

