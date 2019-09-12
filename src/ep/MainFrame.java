package ep;

import static ep.SELOP.stableMatching;

//import  ep.NewClass;
//import static ep.NewClass.Emp;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    
    static ArrayList<Integer> Emp;
    static ArrayList<Integer> Leader;
    static int x,y;
    static{
try  {
     java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
          String query ="select * from emp_pre";
          PreparedStatement ps=conn.prepareStatement(query);
          ResultSet rs=ps.executeQuery();
          ResultSetMetaData rst=rs.getMetaData();
          int columnCount = rst.getColumnCount();
          Emp = new ArrayList<>(columnCount);
          
          while(rs.next()){
              int i=2;
              while(i<=columnCount)
              {
                  Emp.add(rs.getInt(i++));
              }
          }
          
      x=Emp.size();
      x=x/5;
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }
    
    static{
try  {
     java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
          String query ="select * from leader_pre";
          PreparedStatement ps=conn.prepareStatement(query);
          ResultSet rs=ps.executeQuery();
          ResultSetMetaData rst=rs.getMetaData();
          int columnCount = rst.getColumnCount();
          Leader = new ArrayList<>(columnCount);
          
          while(rs.next()){
              int i=2;
              while(i<=columnCount)
              {
                  Leader.add(rs.getInt(i++));
              }
          }
          
     y=Leader.size();
     y=y/5;
}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }
    
//static int [][]d;
    
    public Integer[][] get(){
        Integer [][]a = new Integer[x][5];
        
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<5;j++)
            {
                int g=5*i+j;
                a[i][j]=Emp.get(g);
            }
        }
        
        
        return a;
        
    }
    
    public Integer[][] get1(){
        Integer [][]a = new Integer[y][5];
        
        for(int i=0;i<y;i++)
        {
            for(int j=0;j<5;j++)
            {
                int g=5*i+j;
                a[i][j]=Leader.get(g);
            }
        }
        
        
        return a;
        
    }

    int prefer[][] = new int[][]{{7, 5, 6, 4},  
                                 {5, 4, 6, 7},  
                                 {4, 5, 6, 7},  
                                 {4, 5, 6, 7},  
                                 {0, 1, 2, 3},  
                                 {0, 1, 2, 3},  
                                 {0, 1, 2, 3},  
                                 {0, 1, 2, 3}};
    
    
    static int [][]d;
  
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Final output");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(870, 620, 230, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ep/images/IMG-20190302-WA0008.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SELOP o = new SELOP();
        o.stableMatching(prefer);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        System.out.println(Emp);
    System.out.println(Leader);
    
    Integer [][]a=new NewClass().get();
    Integer [][]b=new NewClass().get1();
    d=new int[x+y][5];
    Integer e=0;
    
    for(Integer []c:a)
    {
       for(Integer y:c)
           System.out.print(y+" ");
       
       System.out.println(" ");
    }

    for(Integer []c:b)
    {
       for(Integer y:c)
           System.out.print(y+" ");
       
       System.out.println(" ");
    }
    
    for(int i=0;i<(x);i++)
    {
        for(int j=0;j<5;j++)
        {
           d[i][j]=a[i][j]; 
        }
    }
    e=x;
    for(int i=0;i<(y);i++)
    {
        for(int j=0;j<5;j++)
        {
           d[e][j]=b[i][j]; 
        }
        e++;
    }
    
    for(int []c:d)
    {
       for(int y:c)
           System.out.print(y+" ");
       
       System.out.println(" ");
    }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
