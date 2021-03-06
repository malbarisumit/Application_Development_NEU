/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Interface.ManageAirlines.ManageAirline;
import Interface.BookFlight.ManageBooking;
import Business.Airline;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;




public class Mainframe2 extends javax.swing.JPanel {

    /**
     * Creates new form CreateCarJPanel
     */

private TravelAgency travelAgency ;
private JPanel userProcessContainer;
    public Mainframe2(JPanel userProcessContainer ,TravelAgency travelAgency , String role) {
        initComponents();
        this.userProcessContainer = userProcessContainer ;
        this.travelAgency = travelAgency ;
        if (role.equalsIgnoreCase("agent")) {
        manageAirlineButton.setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageAirlineButton = new javax.swing.JButton();
        bookFlightButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 128, 128));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(925, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airline Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 811, -1));

        manageAirlineButton.setBackground(new java.awt.Color(0, 0, 0));
        manageAirlineButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        manageAirlineButton.setForeground(new java.awt.Color(255, 255, 255));
        manageAirlineButton.setText("Manage Airline");
        manageAirlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlineButtonActionPerformed(evt);
            }
        });
        add(manageAirlineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 260, 50));

        bookFlightButton.setBackground(new java.awt.Color(0, 0, 0));
        bookFlightButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        bookFlightButton.setForeground(new java.awt.Color(255, 255, 255));
        bookFlightButton.setText("Book Flight");
        bookFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightButtonActionPerformed(evt);
            }
        });
        add(bookFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 260, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void manageAirlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlineButtonActionPerformed
        // TODO add your handling code here:
        ManageAirline   managerAirlinePanel = new ManageAirline(userProcessContainer, travelAgency);
        userProcessContainer.add("ManageAirlineJPanel",managerAirlinePanel);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.next(userProcessContainer);
    }//GEN-LAST:event_manageAirlineButtonActionPerformed

    private void bookFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightButtonActionPerformed
        // TODO add your handling code here:
        ManageBooking   manageBooking = new ManageBooking(userProcessContainer, travelAgency);
        userProcessContainer.add("ManageAirlineJPanel",manageBooking);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.next(userProcessContainer);
    }//GEN-LAST:event_bookFlightButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookFlightButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageAirlineButton;
    // End of variables declaration//GEN-END:variables
}
