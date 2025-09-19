public class Problem7 {
    public static void main(String[] args) {
        Patient[] patientList = new Patient[] {
            new InPatient(101,"Anita",30,5,2000),
            new OutPatient(102,"Soham",25)
        };
        for (Patient pat : patientList) {
            System.out.println(pat.getPatientDetails());
            System.out.println("Bill: " + pat.calculateBill());
            System.out.println("----");
        }
    }
}

abstract class Patient {
    private int patId;
    private String patName;
    private int patAge;

    public Patient(int id,String name,int age){ 
        this.patId = id; 
        this.patName = name; 
        this.patAge = age; 
    }
    public int getPatId(){ return patId; }
    public String getPatName(){ return patName; }
    public int getPatAge(){ return patAge; }
    public String getPatientDetails(){ 
        return "["+patId+"] "+patName+" (age "+patAge+")"; 
    }
    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String note);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int stayDays;
    private double costPerDay;
    private String recordNotes = "";

    public InPatient(int id,String name,int age,int stayDays,double costPerDay){ 
        super(id,name,age); 
        this.stayDays = stayDays; 
        this.costPerDay = costPerDay; 
    }
    @Override
    public double calculateBill(){ 
        return stayDays * costPerDay + 500; // plus fixed charges
    }
    @Override
    public void addRecord(String note){ recordNotes += note + "\n"; }
    @Override
    public String viewRecords(){ 
        return recordNotes.isEmpty() ? "No records" : recordNotes; 
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String recordNotes = "";

    public OutPatient(int id,String name,int age){ 
        super(id,name,age); 
    }
    @Override
    public double calculateBill(){ return 300; } // consultation fee
    @Override
    public void addRecord(String note){ recordNotes += note + "\n"; }
    @Override
    public String viewRecords(){ 
        return recordNotes.isEmpty() ? "No records" : recordNotes; 
    }
}
