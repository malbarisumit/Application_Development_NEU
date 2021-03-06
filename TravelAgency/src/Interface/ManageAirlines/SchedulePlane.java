/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirlines;

import Business.Airline;
import Business.Airplane;
import Business.AirplaneFleet;
import Business.PlaneDetails;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SchedulePlane extends javax.swing.JPanel {

    /**
     * Creates new form CreateCarJPanel
     */
    private Airline airline;
    private JPanel userProcessContainer;
    private Airplane airplane;

    public SchedulePlane(Airline airline, JPanel userProcessContainer, Airplane airplane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.airline = airline;
        this.airplane = airplane;
        intitialTextField();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scheduleButton = new javax.swing.JButton();
        airlineTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pricePerSeatTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        destinationTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        flightIdTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        startingPointTextField = new javax.swing.JTextField();
        backButtonViewAllPlanes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        minComboBox = new javax.swing.JComboBox();
        hourComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(925, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scheduleButton.setBackground(new java.awt.Color(0, 0, 0));
        scheduleButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        scheduleButton.setForeground(new java.awt.Color(255, 255, 255));
        scheduleButton.setText("Schedule");
        scheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleButtonActionPerformed(evt);
            }
        });
        add(scheduleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 160, 40));

        airlineTextField.setEnabled(false);
        add(airlineTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 190, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Airline");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 270, 50));

        pricePerSeatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricePerSeatTextFieldActionPerformed(evt);
            }
        });
        add(pricePerSeatTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 180, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price per Seat");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 220, 20));
        add(destinationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 180, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Destination");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 210, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Time ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 190, 20));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 180, 20));
        add(flightIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 180, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Flight Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 190, 20));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Starting Point");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 220, 20));
        add(startingPointTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 180, 30));

        backButtonViewAllPlanes.setBackground(new java.awt.Color(0, 0, 0));
        backButtonViewAllPlanes.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        backButtonViewAllPlanes.setForeground(new java.awt.Color(255, 255, 255));
        backButtonViewAllPlanes.setText("Back");
        backButtonViewAllPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonViewAllPlanesActionPerformed(evt);
            }
        });
        add(backButtonViewAllPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 35, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Schedule Plane");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 813, -1));
        add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 180, 30));

        minComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(minComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 70, 30));

        hourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(hourComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 70, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void intitialTextField() {
        airlineTextField.setText(airline.getNameOfAirline());
        jXDatePicker1.getEditor().setEnabled(false);
        hourComboBox.removeAllItems();
        minComboBox.removeAllItems();
        for (int i = 0; i < 24; i++) {
            hourComboBox.addItem(i);
        }

        for (int j = 0; j < 60; j++) {
            minComboBox.addItem(j);

        }
    }
    private void scheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleButtonActionPerformed
        // TODO add your handling code here:
        if(startingPointTextField.getText().equalsIgnoreCase(destinationTextField.getText()) ){
        JOptionPane.showMessageDialog(null, "Destination cannot be same as starting point", "Error", 0);
        return;
        }
        if ((flightIdTextField.getText().isEmpty()) || (startingPointTextField.getText().isEmpty())
                || (destinationTextField.getText().isEmpty()) || (jXDatePicker1.getDate() == null)
                || (pricePerSeatTextField.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Please enter all the flight details", "Error", 0);
        } else {
            try {
                
               for (PlaneDetails flight: airplane.getAirplaneListOfFlight()){
               
                   if (flight.getFlightId() == (Integer.parseInt(flightIdTextField.getText()))) {
                       
                        JOptionPane.showMessageDialog(null, "Flight Already Exists", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                   
                   }
               
               }
                   
                int id = Integer.parseInt(flightIdTextField.getText());
                double price = Double.parseDouble(pricePerSeatTextField.getText());
                if ((id >= 0) && (price >= 0)) {
                    try {

                        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
                        Date date = jXDatePicker1.getDate();
                        Date currdate = (Date) dateFormat.parse(dateFormat.format(new Date()));

                        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
                        Date time = (Date) timeFormat.parse(hourComboBox.getSelectedItem().toString() + ":" + minComboBox.getSelectedItem().toString());
                        Date currtime = (Date) timeFormat.parse(timeFormat.format(new Date()));
                        if (((date.equals(currdate)) && (time.after(currtime))) || (date.after(currdate))) {
                            PlaneDetails flight = airline.getFleetschedule().addFlight();
                            flight.setAirplane(airplane);
                            airplane.getAirplaneListOfFlight().add(flight);
                            flight.setDepatureDate(date);
                            flight.setDepaturePort(startingPointTextField.getText());
                            flight.setDepatureTime(hourComboBox.getSelectedItem().toString() + ":" + minComboBox.getSelectedItem().toString());
                            flight.setDestinationPort(destinationTextField.getText());
                            flight.setFlightId(id);
                            flight.setPriceOfSeat(price);
                            JOptionPane.showMessageDialog(null, "Plane Scheduled Successfully");
                        } else {
                            JOptionPane.showMessageDialog(null, "Please Enter Todays or futher depature Date and time", "Error", 0);
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Please enter proper data and time format ", "Error", 0);
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Enter proper flight id and seats", "Error", 0);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Id and seat are numeric fields", "Error", 0);
                e.printStackTrace();
            }
        }
    }

    {


    }//GEN-LAST:event_scheduleButtonActionPerformed

    private void pricePerSeatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricePerSeatTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricePerSeatTextFieldActionPerformed

    private void backButtonViewAllPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonViewAllPlanesActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonViewAllPlanesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlineTextField;
    private javax.swing.JButton backButtonViewAllPlanes;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JTextField flightIdTextField;
    private javax.swing.JComboBox hourComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JComboBox minComboBox;
    private javax.swing.JTextField pricePerSeatTextField;
    private javax.swing.JButton scheduleButton;
    private javax.swing.JTextField startingPointTextField;
    // End of variables declaration//GEN-END:variables
}
