/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Ambulance.getValue())){
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Staff.getValue())){
            organization = new hospitalStaff();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Insurance.getValue())){
            organization = new InsuranceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
     public void removeOrganization(Organization org){
        
        organizationList.remove(org);
    }
}