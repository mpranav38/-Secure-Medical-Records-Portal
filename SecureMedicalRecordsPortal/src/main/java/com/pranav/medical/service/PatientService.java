
package com.pranav.medical.service;

import com.pranav.medical.model.Patient;
import com.pranav.medical.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public ResponseEntity<Patient> getPatientById(Long id) {
        return patientRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public Patient updatePatient(Long id, Patient newPatient) {
        return patientRepository.findById(id).map(p -> {
            p.setName(newPatient.getName());
            p.setAge(newPatient.getAge());
            p.setGender(newPatient.getGender());
            p.setDiagnosis(newPatient.getDiagnosis());
            return patientRepository.save(p);
        }).orElse(null);
    }

    public ResponseEntity<?> deletePatient(Long id) {
        return patientRepository.findById(id).map(p -> {
            patientRepository.delete(p);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
