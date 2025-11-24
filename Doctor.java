public class Doctor { // Doctor's class

    private String doctorName; // attribute of the supper class
    private String areaOfSpecialization;
    private String contactInfo;


    public Doctor(String doctorName, String areaOfSpecialization, String contactInfo){ // constructor
        this.doctorName = doctorName;
        this.areaOfSpecialization = areaOfSpecialization;
        this.contactInfo = contactInfo;
    }

    // we use getter to get the attributes
    public String getDoctorID(){
        return doctorName;
    }

    public String getAreaOfSpecialization(){
        return areaOfSpecialization;
    }

    public String getContactInfo(){
        return contactInfo;
    }

        // we use setter to enables us access the attribute
    public void setDoctorID(String doctorName){
        this.doctorName = doctorName;
    }
    public void setAreaOfSpecializaiton(String areaOfSpecialization){
        this.areaOfSpecialization = areaOfSpecialization;
    }


    // method containning doctor's information, alert, feedback, and generalhealthcheck

    public String details(){
    return "\nDoctor's Name: " + doctorName + ",\n Area Of Specialization: " + areaOfSpecialization + ",\n Contact Info: " + contactInfo;
}
    
    public String reviewAlert(){ 
        return "\nPatient vitals currently under review......";

    }

    public String sendFeedBack(){ 
        return "\nFeedback: Your Bp is high \n Recommendation: Get some rest, you are working too hard " ;

    }

    public String reviewGeneralHealth(){
        return "\nEverything else looks okay for now, except for the Bp" ;     
    }

}
    // we create our class and print out the information
    class Main{
        public static void main(String[] args){
            Doctor Doctor1 = new Doctor("Yanny Jay", "cardiologist", "321john@gmail.com");
            System.out.println(Doctor1.details());
            System.out.println(Doctor1.reviewAlert());
            System.out.println(Doctor1.sendFeedBack());
            System.out.println(Doctor1.reviewGeneralHealth());
        }
    }