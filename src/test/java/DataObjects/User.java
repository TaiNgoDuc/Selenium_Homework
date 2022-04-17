package DataObjects;

public class User {

    public String EMAIL;
    public String PASSWORD;
    public String CONFIRM_PASSWORD;
    public String PID;


    public String getEMAIL() {
        return EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getCONFIRM_PASSWORD() {
        return CONFIRM_PASSWORD;
    }

    public String getPID() {
        return PID;
    }


    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public void setCONFIRM_PASSWORD(String CONFIRM_PASSWORD) {
        this.CONFIRM_PASSWORD = CONFIRM_PASSWORD;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }


}
