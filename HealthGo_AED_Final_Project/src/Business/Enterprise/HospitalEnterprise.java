/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
     public ArrayList<Organization.Type> getSupportedOrganization() {
        ArrayList<Type> arrayList = new ArrayList<Organization.Type>();
        arrayList.add(Type.Lab);
        arrayList.add(Type.Doctor);
        arrayList.add(Type.Ambulance);
        
        return arrayList;
    }
}
