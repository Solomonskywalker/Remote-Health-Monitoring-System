public class Healthdata { // health data class

    private int dataID; // attributes
    private String heartRate;
    private int bloodPressure;
    private int temperature;
    private int timeStamp;
    private String status;

    // constructor
    public Healthdata(int dataID, String heartRate, int bloodPressure, int temperature, int timeStamp, String status){
        this.dataID = dataID;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.timeStamp = timeStamp;
        this.status =status;
    }

// we use getter since out attributes are private
    public int getDataID(){
        return dataID;
    }
    public String getHeartRate(){
        return heartRate;
    }
    public int getBloodPressure(){
        return bloodPressure;
    }
    public int getTemperature(){
        return temperature;
    }
    public int getTimeStamp(){
        return timeStamp;
    }
    public String getStatus(){
        return status;
    }
    // we use setters to enable us access the private attributes
    public void setDataID(int dataID){
        this.dataID = dataID;
    }
    public void setHeartRate(String hearRate){
        this.heartRate = hearRate;
    }
    public void setBloodPressure(int bloodPressure){
        this.bloodPressure = bloodPressure;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public void setTimeStamp(int timeStamp){
        this.timeStamp = timeStamp;
    }
    public void setGetStatus(String status){
        this.status = status;
    }

    // out detail method containing the data information
    public String getDetails(){
        return "DataID: " + dataID + ", HeartRate: " + heartRate + ", BloodPressure: " + bloodPressure + ", Temperature: " + temperature + ", TimeStamp: " + timeStamp + ", Status: " + status ;
    }

}
    class Main{ // we create health data object and print out the information
        public static void main(String[] args){
            Healthdata HealthInfo = new Healthdata(1, "150/95", 72, 36, 1244, "recieved");
            System.out.println(HealthInfo.getDetails());
        }
    }
