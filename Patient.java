 class Patient{ // the patient class
    private int patientid; // attribute of the patient class
    private String patientName;
    private int age;
    private String illnessType;
    private String gender;
    private String contactInfo;


// constructor 
    public Patient(int patientid, String patientName, int age, String illnessType, String gender, String contactInfo){
        this.patientid = patientid;
        this.patientName = patientName;
        this.age = age;
        this.illnessType = illnessType;
        this.gender = gender;
        this.contactInfo = contactInfo;
    }
   
    // we use getter to get the attributes
    public int getPatientid(){
        return patientid;
    }
    public String getPatientName(){
        return patientName;
    }

    public int getAge(){
        return age;
    }

    public String getIllnessType(){
        return illnessType;
    }

    public String getGender(){
        return gender;
    }
    
    public String getContactInfo(){
        return contactInfo;
    }

    // we use setter to access make the private attribute accessible
    public void setPatientid(int patientid){
        this.patientid = patientid;
    }

    public void setPatientName(String patientName){
        this.patientName = patientName;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setIllnessType(String illnessType){
        this.illnessType = illnessType;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

        //  Methods for getting details, and updating details
     public String getDetails(){
        return "Patient ID " + patientid + ", Patient Name: " + patientName +  ", Age: " + age + ", Illness: " + illnessType + ", Gender: " + gender + ", Contact Info: " + contactInfo;
    }  
    public String updateDetails(){
        return "Patient ID : " + patientid + ", Patient Name: " + patientName + ", Age: " + age + ", Illness: "+ illnessType + ", Gender: " + gender + ", Contact Info: " + contactInfo;
        
    }
}
    // subclass, an extention of the superclass
    class DiabeticPatient extends Patient {
        public DiabeticPatient(int patientid, String patientName, int age, String illnessType, String gender, String contactInfo){
            super(patientid, patientName, age, illnessType, gender, contactInfo);
    }

        // we override the method to pass in new information
    @Override
    public String getDetails(){
        return super.getDetails() + " Patient Type: Diabetic paient ";
    }
}
    // we create an object and print out informaiton
    class Main{ 
    public static void main(String[] args){
        Patient patient1= new Patient(01, "john", 20, "Diabetes", "Male", "JOhn@");
        System.out.println("Patient details");
        System.out.println(patient1.getDetails());
    }
}



