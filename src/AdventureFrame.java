
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author muirw5809
 */
public class AdventureFrame extends javax.swing.JFrame {

    private HHSSAdventure Controller;

    /**
     * Creates new form AdventureFrame
     */
    public AdventureFrame(HHSSAdventure Controller) {
        this.Controller = Controller;
        initComponents();
    }

    public void setLocationName(String name) {

        locationName.setText(name);
    }

    public void setDirection(String D) {
        Direction.setText(D);
    }

    public void setPicture(BufferedImage i) {
        picturePaint1.setImage(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        picturePaint1 = new PicturePaint();
        locationName = new javax.swing.JLabel();
        Direction = new javax.swing.JLabel();
        Advance = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        Left = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        locationName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        locationName.setForeground(new java.awt.Color(255, 0, 0));
        locationName.setText("jLabel1");
        picturePaint1.add(locationName);
        locationName.setBounds(270, 10, 160, 33);

        Direction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Direction.setForeground(new java.awt.Color(255, 0, 0));
        Direction.setText("jLabel1");
        picturePaint1.add(Direction);
        Direction.setBounds(270, 40, 56, 22);

        Advance.setText("Forward");
        Advance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvanceActionPerformed(evt);
            }
        });
        picturePaint1.add(Advance);
        Advance.setBounds(290, 500, 90, 50);

        Right.setText("Right");
        Right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightActionPerformed(evt);
            }
        });
        picturePaint1.add(Right);
        Right.setBounds(570, 500, 90, 50);

        Left.setText("Left");
        Left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftActionPerformed(evt);
            }
        });
        picturePaint1.add(Left);
        Left.setBounds(0, 500, 80, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
            .addComponent(picturePaint1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(picturePaint1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Method for left button
    private void LeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftActionPerformed
        //when the button is pressed
        //change the direction and scene picture
        Controller.turnLeft();
    }//GEN-LAST:event_LeftActionPerformed
    //Method for advance button
    private void AdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvanceActionPerformed
         //when the button is pressed
        //change the location and scene picture
        Controller.Advance();
    }//GEN-LAST:event_AdvanceActionPerformed
    //Method for right button
    private void RightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightActionPerformed
         //when the button is pressed
        //change the direction and scene picture
        Controller.turnRight();
    }//GEN-LAST:event_RightActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Advance;
    private javax.swing.JLabel Direction;
    private javax.swing.JButton Left;
    private javax.swing.JButton Right;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationName;
    private PicturePaint picturePaint1;
    // End of variables declaration//GEN-END:variables
}
