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
 * @author Ashi
 */

public class PharmacyEnterprise extends Enterprise{
    
     public PharmacyEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Pharmacy);
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public ArrayList<Organization.Type> getSupportedOrganizations() {
        ArrayList<Organization.Type> arrayList = new ArrayList<Organization.Type>();
        arrayList.add(Organization.Type.Pharmacy);        
        
        
        return arrayList;
    }
    
}
