package CTD.drager.Model;

public class Drager {
    private String model;
    private String serial;
    private final String inventoryNumber;
    private String owner;
    private String verification;
    private String status;
    private String flag;

    public Drager(String model, String serial, String inventoryNumber, String owner, String verification, String status) {
        this.model = model;
        this.serial = serial;
        this.inventoryNumber = inventoryNumber;
        this.owner = owner;
        this.verification = verification;
        this.status = status;
        flag = "white";
    }

    public String getModel() { return model; }

    public String getSerial() {
        return serial;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getVerification() {
        return verification;
    }

    public String getStatus() {
        return status;
    }

    public String getFlag() {
        return flag;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
