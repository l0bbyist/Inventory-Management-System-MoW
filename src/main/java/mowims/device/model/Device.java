package mowims.device.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity
//@Table(name="device")
public class Device {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dev_ID;
    
    //@Column(name="dev_NAME", nullable=false)
    private String dev_NAME;
    
    //@Column(name="BRAND")
    private String BRAND;
    
    //@Column(name="SERIAL")
    private String SERIAL;
    
    //@Column(name="dev_OS")
    private String dev_OS;
    
    //@Column(name="STATUS")
    private String STATUS;
    
    //@Column(name="DATE_ADDED")
    private String DATE_ADDED;

    // Constructors, getters, and setters
    public Device() {}

   public Device(Integer dev_ID, String dev_NAME, String BRAND, String SERIAL, String dev_OS, String STATUS, String DATE_ADDED) {
    	this.dev_ID=dev_ID;
    	this.dev_NAME = dev_NAME;
        this.BRAND = BRAND;
        this.SERIAL = SERIAL;
        this.dev_OS = dev_OS;
        this.STATUS = STATUS;
        this.DATE_ADDED = DATE_ADDED;
    } 
    
    public Integer getDev_ID() {
        return dev_ID;
    }

    public void setDev_ID(Integer dev_ID) {
        this.dev_ID = dev_ID;
    }

    public String getDev_NAME() {
        return dev_NAME;
    }

    public void setDev_NAME(String dev_NAME) {
        this.dev_NAME = dev_NAME;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public String getSERIAL() {
        return SERIAL;
    }

    public void setSERIAL(String SERIAL) {
        this.SERIAL = SERIAL;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getDev_OS() {
        return dev_OS;
    }

    public void setDev_OS(String dev_OS) {
        this.dev_OS = dev_OS;
    }
    public String getDate_Added() {
        return DATE_ADDED;
    }
    public void setDate_Added(String DATE_ADDED) {
        this.DATE_ADDED = DATE_ADDED;
    }
}
