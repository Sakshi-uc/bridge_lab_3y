import java.util.*;

class Doctor {
    private String doctorName;
    private List<Patient> patientList = new ArrayList<>();

    public Doctor(String name){ this.doctorName = name; }

    public String getName(){ return doctorName; }

    public void consult(Patient patient){
        patientList.add(patient);
        patient.addDoctor(this);
        System.out.println("Doctor " + doctorName + " consulted patient " + patient.getName());
    }
}

class Patient {
    private String patientName;
    private List<Doctor> doctorList = new ArrayList<>();

    public Patient(String name){ this.patientName = name; }

    public String getName(){ return patientName; }

    public void addDoctor(Doctor doctor){ doctorList.add(doctor); }
}

class Hospital {
    private String hospitalName;

    public Hospital(String name){ this.hospitalName = name; }
}

public class HospitalAssociationDemo {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr. Sharma");
        Doctor doctor2 = new Doctor("Dr. Gupta");

        Patient patient1 = new Patient("Amit");
        Patient patient2 = new Patient("Sneha");

        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor2.consult(patient2);
    }
}
