/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import javax.swing.JOptionPane;
import userinterface.DoctorRole.RequestLabTestJPanel;
import Business.Person.PersonDirectory;

/**
 *
 * @author raunak
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PatientOrganization patientOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    private UserAccount userAccount;
    private PersonDirectory personlist;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.patientOrganization = (PatientOrganization)organization;
        this.enterprise=enterprise;
        this.userAccount = userAccount;
        valueLabel.setText(userAccount.getEmployee().getName());
        
        //populateRequestTable();
    }
    
//    public void populateRequestTable(){
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
//        
//        model.setRowCount(0);
//        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0] = request.getMessage();
//            row[1] = request.getReceiver();
//            row[2] = request.getStatus();
//            //String result = ((LabTestWorkRequest) request).getTestResult();
//            //row[3] = result == null ? "Waiting" : result;
//            
//            model.addRow(row);
//        }
//    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        registerForOrganTransplantButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        enterpriseLabel.setText("WELCOME");

        valueLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Work Area");

        registerForOrganTransplantButton.setBackground(new java.awt.Color(255, 0, 0));
        registerForOrganTransplantButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        registerForOrganTransplantButton.setText("S.O.S");
        registerForOrganTransplantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerForOrganTransplantButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerForOrganTransplantButton, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addComponent(registerForOrganTransplantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerForOrganTransplantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerForOrganTransplantButtonActionPerformed
 
      
    }//GEN-LAST:event_registerForOrganTransplantButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RegisterationJPanel", new RegistrationJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton registerForOrganTransplantButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}