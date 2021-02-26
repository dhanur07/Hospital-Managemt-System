/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String firstName;
    private String message;

    private UserAccount sender;
    private UserAccount assignedStaff;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String lastName;
    private String gender;
    private Integer age;
    private String Address;
     private double Amount;
     private String  scantype;
     private String insuranceStatus;
     private double acceptedamount;
     private String mri;
     private UserAccount doctor;
     private UserAccount ambulanceDriver;
     private UserAccount pharmacist;
     private UserAccount assignedLab;
     private static int counter=1;
     private String patientID;
    public UserAccount getAssignedLab() {
        return assignedLab;
    }

    public void setAssignedLab(UserAccount assignedLab) {
        this.assignedLab = assignedLab;
    }

    public UserAccount getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(UserAccount pharmacist) {
        this.pharmacist = pharmacist;
    }

    public UserAccount getAmbulanceDriver() {
        return ambulanceDriver;
    }

    public void setAmbulanceDriver(UserAccount ambulanceDriver) {
        this.ambulanceDriver = ambulanceDriver;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public String getMri() {
        return mri;
    }

    public void setMri(String mri) {
        this.mri = mri;
    }

    public double getAcceptedamount() {
        return acceptedamount;
    }

    public void setAcceptedamount(double acceptedamount) {
        this.acceptedamount = acceptedamount;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public String getScantype() {
        return scantype;
    }

    public void setScantype(String scantype) {
        this.scantype = scantype;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID( String patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    private String dosage;
    private String ambulanceStatus="No request sent";
    private String pharmacyStatus="No request sent";
    public String getAmbulanceStatus() {
        return ambulanceStatus;
    }

    public void setAmbulanceStatus(String ambulanceStatus) {
        this.ambulanceStatus = ambulanceStatus;
    }

    public String getPharmacyStatus() {
        return pharmacyStatus;
    }

    public void setPharmacyStatus(String pharmacyStatus) {
        this.pharmacyStatus = pharmacyStatus;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    public WorkRequest(){
        requestDate = new Date();
        
        patientID = Integer.toString(counter);
        ++counter;
    }

  

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getAssignedStaff() {
        return assignedStaff;
    }

    public void setAssignedStaff(UserAccount assignedStaff) {
        this.assignedStaff = assignedStaff;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString()
    {
            return firstName;
    }
}
