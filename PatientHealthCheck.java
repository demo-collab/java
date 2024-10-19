class PatientException extends Exception {
    public PatientException(String message) {
        super(message);
    }
}

class Patient {
    String patientName;
    int patientAge;
    double patientOxyLevel;
    int patientHRCTReport;

    public Patient(String patientName, int patientAge, double patientOxyLevel, int patientHRCTReport) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientOxyLevel = patientOxyLevel;
        this.patientHRCTReport = patientHRCTReport;
    }

    public void checkHealthStatus() throws PatientException {
        if (patientOxyLevel < 95 || patientHRCTReport > 10) {
            throw new PatientException("Patient is Covid Positive(+) and Needs to be Hospitalized");
        }
    }

    @Override
    public String toString() {
        return "Patient Name: " + patientName + 
               "\nPatient Age: " + patientAge + 
               "\nOxygen Level: " + patientOxyLevel + 
               "\nHRCT Report: " + patientHRCTReport;
    }
}

public class PatientHealthCheck {
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe", 30, 94, 12);
        
        try {
            patient.checkHealthStatus();
            System.out.println("Patient information:\n" + patient);
        } catch (PatientException e) {
            System.out.println(e.getMessage());
        }
    }
}