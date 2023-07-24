public class HospitalTest {


}
class HospitalPatientApplication{
        private String patientName;
        private String patientAge;
        private String patientWeight;
        private String bloodGroup;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(String patientWeight) {
        this.patientWeight = patientWeight;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public void showPatientDetails(){
        System.out.println("PatientName : "+patientName);
        System.out.println("PatientAge : "+patientAge);
        System.out.println("PatientBloodGroup :"+bloodGroup);
        System.out.println("PatientWeight: "+patientWeight);
}
class HeartSurgeon extends HospitalPatientApplication {
    private String PatientName;
    private String PatientWeight;
    private char BloodGroup;
        private int PatientHeartBits;
        private String BloodPressure;

    public HeartSurgeon(int patientHeartBits) {
        PatientHeartBits = patientHeartBits;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public String getPatientWeight() {
        return PatientWeight;
    }

    public void setPatientWeight(String patientWeight) {
        PatientWeight = patientWeight;
    }

    public char getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(char bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public int getPatientHeartBits() {
        return PatientHeartBits;
    }

    public void setPatientHeartBits(int patientHeartBits) {
        PatientHeartBits = patientHeartBits;
    }

    public String getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        BloodPressure = bloodPressure;
    }

}


}
class Dentist{

}
class Therapist{

}