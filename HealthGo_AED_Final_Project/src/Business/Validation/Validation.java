/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author Hardik
 */
public class Validation {

    public boolean checkEmpty(String value) {

        if (value.isEmpty()) {
            return true;
        }
        return false;
    }
    
   
    public boolean regexTextCheck(String text) {
        String regexText = "[a-zA-Z]+";
        if (text.matches(regexText)) {
            return true;
        }

        return false;
    }
    
    public boolean regexMedicineName(String user) {
        String regexUser = "^[a-zA-Z0-9]{1,}$";
        if (user.matches(regexUser)) {
            return true;
        }
        //JOptionPane.showMessageDialog(null, "Please enter the field correctly");
        return false;
    }
    
     

    public boolean regexAgeCheck(String number) {
        String regexNumber = "[0-9]+";
        if (number.matches(regexNumber)) {
            return true;
        }
        // JOptionPane.showMessageDialog(null, "Please enter the field in Number only");
        return false;
    }

    public boolean regexUser(String user) {
        String regexUser = "^[a-zA-Z0-9]{6,}$";
        if (user.matches(regexUser)) {
            return true;
        }
        //JOptionPane.showMessageDialog(null, "Please enter the field correctly");
        return false;
    }
      public boolean regexNumberCheck(String number) {
        int a = Integer.parseInt(number);
        if (a<0) {
            return true;
        }
        return false;
    }


}
