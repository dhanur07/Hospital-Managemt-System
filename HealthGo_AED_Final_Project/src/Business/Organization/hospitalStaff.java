/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StaffRole;
import java.util.ArrayList;

/**
 *
 * @author Ashi
 */
public class hospitalStaff extends Organization {

    public hospitalStaff() {
    super(Organization.Type.Staff.getValue());
    }
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StaffRole());
        return roles;
    }
    
}
