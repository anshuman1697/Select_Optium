/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SMART
 */
public class Leader_Pre extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public Leader_Pre() {
        initComponents();
        fillcombo();
        fillcombo1();
        fillcombo2();
        fillcombo3();
        fillcombo4();
        fillcombo5();
        
    }

    
    private void fillcombo(){
    try{
          java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
                    
          String sql="select * from emp";
          PreparedStatement ps=conn.prepareStatement(sql);
          ResultSet rst=ps.executeQuery();
          
          while(rst.next()){
          String name=rst.getString("Emp_id");
          ComboBox1.addItem(name);
          }
          
          ps.close();
          conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

}
    private void fillcombo1(){
    try{
          java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
                    
          String sql="select * from leader";
          PreparedStatement ps=conn.prepareStatement(sql);
          ResultSet rst=ps.executeQuery();
          
          while(rst.next()){
          String name=rst.getString("Lead_id");
          ComboBox2.addItem(name);
          }
          
          ps.close();
          conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
    

}
    private void fillcombo2(){
    try{
          java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
                    
          String sql="select * from emp";
          PreparedStatement ps=conn.prepareStatement(sql);
          ResultSet rst=ps.executeQuery();
          
          while(rst.next()){
          String name=rst.getString("Emp_id");
          ComboBox3.addItem(name);
          }
          
          ps.close();
          conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

}
    private void fillcombo3(){
    try{
          java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
                    
          String sql="select * from emp";
          PreparedStatement ps=conn.prepareStatement(sql);
          ResultSet rst=ps.executeQuery();
          
          while(rst.next()){
          String name=rst.getString("Emp_id");
          ComboBox4.addItem(name);
          }
          
          ps.close();
          conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

}
    private void fillcombo4(){
    try{
          java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
                    
          String sql="select * from emp";
          PreparedStatement ps=conn.prepareStatement(sql);
          ResultSet rst=ps.executeQuery();
          
          while(rst.next()){
          String name=rst.getString("Emp_id");
          ComboBox5.addItem(name);
          }
          
          ps.close();
          conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

}
    private void fillcombo5(){
    try{
          java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
                    
          String sql="select * from emp";
          PreparedStatement ps=conn.prepareStatement(sql);
          ResultSet rst=ps.executeQuery();
          
          while(rst.next()){
          String name=rst.getString("Emp_id");
          ComboBox6.addItem(name);
          }
          
          ps.close();
          conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        ComboBox3 = new javax.swing.JComboBox<>();
        ComboBox4 = new javax.swing.JComboBox<>();
        ComboBox5 = new javax.swing.JComboBox<>();
        ComboBox6 = new javax.swing.JComboBox<>();
        Button = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(850, 613));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 613));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("                                       Leader Preference Order");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 10, 704, 63);

        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox1);
        ComboBox1.setBounds(589, 171, 103, 31);

        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox2);
        ComboBox2.setBounds(589, 122, 103, 31);

        ComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox3);
        ComboBox3.setBounds(589, 220, 103, 31);

        ComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox4);
        ComboBox4.setBounds(590, 280, 103, 31);

        ComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox5);
        ComboBox5.setBounds(589, 344, 103, 31);

        ComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBox6);
        ComboBox6.setBounds(589, 402, 103, 31);

        Button.setText("Submit");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Button);
        Button.setBounds(390, 490, 87, 26);

        jTextField1.setText("Leader Id");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(178, 122, 88, 31);

        jTextField3.setText("Preference 2");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(178, 220, 88, 35);

        jTextField2.setText("Preference 1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(178, 167, 88, 35);

        jTextField4.setText("Preference 3");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(178, 277, 88, 35);

        jTextField5.setText("Preference 4");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(178, 342, 88, 35);

        jTextField6.setText("Preference 5");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(178, 398, 88, 35);

        jButton1.setText("Output Frame");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 520, 150, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ep/images/IMG-20190302-WA0009.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-20, 10, 1260, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
            PreparedStatement ps;
            String sql ="Insert into leader_pre (L_id,P1,P2,P3,P4,P5) values (?,?,?,?,?,?)";
            ps=conn.prepareStatement(sql);
            String p=ComboBox2.getSelectedItem().toString();
            String v=ComboBox1.getSelectedItem().toString();
            String v1=ComboBox3.getSelectedItem().toString();
            String v2=ComboBox4.getSelectedItem().toString();
            String v3=ComboBox5.getSelectedItem().toString();
            String v4=ComboBox6.getSelectedItem().toString();
            System.out.println("haha yahan");
            ps.setString(1,p);         
            ps.setString(2,v);            
            ps.setString(3,v1);
            ps.setString(4,v2);
            ps.setString(5,v3);            
            ps.setString(6,v4);
            int ans=ps.executeUpdate();
            System.out.println(ans);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Leader_Pre.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_ButtonActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel6MouseClicked

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox2ActionPerformed

    private void ComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox3ActionPerformed

    private void ComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox4ActionPerformed

    private void ComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox5ActionPerformed

    private void ComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox6ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainFrame m = new MainFrame();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Leader_Pre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leader_Pre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leader_Pre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leader_Pre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leader_Pre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JComboBox<String> ComboBox3;
    private javax.swing.JComboBox<String> ComboBox4;
    private javax.swing.JComboBox<String> ComboBox5;
    private javax.swing.JComboBox<String> ComboBox6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}