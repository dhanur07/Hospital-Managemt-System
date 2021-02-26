/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.InsuranceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Insurance.InsuranceMainJPanel;

import javax.swing.JPanel;

/**
 *
 * @author Ashi
 */
public class InsuranceAgentRole extends Role {
    
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new InsuranceMainJPanel(userProcessContainer, account, (InsuranceOrganization)organization, enterprise);
    }
    
}
