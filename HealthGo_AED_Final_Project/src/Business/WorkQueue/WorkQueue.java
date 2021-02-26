/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<WorkRequest> ambulanceWorkRequest;
    private ArrayList<WorkRequest> pharmacyWorkRequests;
        private ArrayList<WorkRequest> ambulanceStaffWorkRequest;

    public ArrayList<WorkRequest> getAmbulanceStaffWorkRequest() {
        return ambulanceStaffWorkRequest;
    }

    public void setAmbulanceStaffWorkRequest(ArrayList<WorkRequest> ambulanceStaffWorkRequest) {
        this.ambulanceStaffWorkRequest = ambulanceStaffWorkRequest;
    }


    public ArrayList<WorkRequest> getPharmacyWorkRequests() {
        return pharmacyWorkRequests;
    }

    public void setPharmacyWorkRequests(ArrayList<WorkRequest> pharmacyWorkRequests) {
        this.pharmacyWorkRequests = pharmacyWorkRequests;
    }

    public WorkQueue() {
        workRequestList = new ArrayList();
        ambulanceWorkRequest= new ArrayList();
        pharmacyWorkRequests= new ArrayList();
    }

    public ArrayList<WorkRequest> getAmbulanceWorkRequest() {
        return ambulanceWorkRequest;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}