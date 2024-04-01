package CTD.drager.Model;

public class Drager {
    private String model;
    private String serial;
    private String inventoryNumber;
    private String owner;
    private String verification;
    private String status;
    private String flag;

    public Drager(){}

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

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
