/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Cars;
import Business.CarsDirectory;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sai
 */
public class SecondarySearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecondarySearchPanel
     */
    private JPanel userProcessContainer;
    private JTable tblCarsByBrand;
    private CarsDirectory carsDirectory;
    private String modelNumber;
    private String city;
    private String txtBrandName;
    
    
   
   
   

    SecondarySearchPanel(JPanel userProcessContainer, JTable tblCarsByBrand, CarsDirectory carsDirectory, String txtBrandName, String modelNumber, String city) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.tblCarsByBrand = tblCarsByBrand;
        this.carsDirectory = carsDirectory;
        this.txtBrandName = txtBrandName;
        this.modelNumber = modelNumber;
        this.city = city;
        populateSecondaryTable();
    }
    
    public String toformat(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String d = formatter.format(date);
        return d;
    }
    
    public void populateSecondaryTable(){
        
       DefaultTableModel tsb = (DefaultTableModel) tblSecondary.getModel();
        tsb.setRowCount(0);
        
        
        for(Cars cars: carsDirectory.getCarsDirectory()){
           
            
            Object[] row =  new Object[10];
            row[0]= cars;
            row[1]=cars.getBrandName();
            row[2]=cars.getNumberOfSeats();
            row[3]=cars.getSerialNumber();
            row[4]=cars.getYearOfManufacturing();
            row[5]=cars.getStatus();
            row[6]=toformat(cars.getExpirationDate());
            row[7]=cars.getLocation();
            row[8]=cars.getCity();
            row[9]=toformat(cars.getUpdatedOn());
            
            //tcb.addRow(row);
            System.out.println(cars.getBrandName());
            System.out.println(txtBrandName);
            System.out.println(modelNumber+cars.getModelNumber());
            System.out.println(city+cars.getCity());
            
            if(txtBrandName.equalsIgnoreCase(cars.getBrandName()) && modelNumber.equalsIgnoreCase(cars.getModelNumber()) && city.equalsIgnoreCase(cars.getCity())){
                
               tsb.addRow(row);
            }
            
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSecondary = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 0));

        btnBack.setBackground(new java.awt.Color(204, 0, 204));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblSecondary.setBackground(new java.awt.Color(153, 153, 255));
        tblSecondary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cars Model", "Brand Name", "No Of Seats", "Serial Number", "Manufactured year", "Status", "Expiration Date", "Location", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSecondary);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSecondary;
    // End of variables declaration//GEN-END:variables
}