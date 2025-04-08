package com.patient_management.patient_service.exception;

public class PatientNotFoundException extends RuntimeException{
    public PatientNotFoundException(String message) {
        super("Patient not found: " + message);
    }
}
