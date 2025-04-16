package mowims.inventoryreport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InventoryReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    private String NAME;
    private String CHEQUE_NO;
    private String OFFICE;
    private String EMAIL;
    private String PHONE;

    // Constructors, getters and setters
    public InventoryReport() {}

    public InventoryReport(String NAME, String CHEQUE_NO, String OFFICE, String EMAIL, String PHONE) {
        this.NAME = NAME;
        this.CHEQUE_NO= CHEQUE_NO;
        this.OFFICE = OFFICE;
        this.EMAIL= EMAIL;
        this.PHONE = PHONE;
        
    }
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCHEQUE_NO() {
        return CHEQUE_NO;
    }

    public void setCHEQUE_NO(String CHEQUE_NO) {
        this.CHEQUE_NO = CHEQUE_NO;
    }

    public String getOFFICE() {
        return OFFICE;
    }

    public void setOFFICE(String OFFICE) {
        this.OFFICE = OFFICE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }
   
}