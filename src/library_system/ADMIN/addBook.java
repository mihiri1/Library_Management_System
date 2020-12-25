/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system.ADMIN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import library_system.dbConnection;
import library_system.Login;

/**
 *
 * @author Mi HI Ri
 */ 
public class addBook extends javax.swing.JFrame {

    /**
     * Creates new form addBook
     */  
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public addBook() {
        initComponents();
        conn=dbConnection.ConnecrDb();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        publishedYear = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        addBook = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Description = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bookName = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Author = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(16, 13, 29));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addBook.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 80, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Published Year");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 190, 10));

        publishedYear.setBackground(new java.awt.Color(16, 13, 29));
        publishedYear.setForeground(new java.awt.Color(255, 255, 255));
        publishedYear.setBorder(null);
        publishedYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishedYearActionPerformed(evt);
            }
        });
        jPanel1.add(publishedYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 190, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        addBook.setBackground(new java.awt.Color(0, 153, 153));
        addBook.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        addBook.setForeground(new java.awt.Color(255, 255, 255));
        addBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup.png"))); // NOI18N
        addBook.setText("Add Book");
        addBook.setOpaque(true);
        addBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookMouseClicked(evt);
            }
        });
        jPanel1.add(addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 120, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/year.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/description.png"))); // NOI18N
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Description");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 20));

        Description.setBackground(new java.awt.Color(16, 13, 29));
        Description.setForeground(new java.awt.Color(255, 255, 255));
        Description.setBorder(null);
        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 190, 80));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 190, 10));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bookName.png"))); // NOI18N
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Book Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        bookName.setBackground(new java.awt.Color(16, 13, 29));
        bookName.setForeground(new java.awt.Color(255, 255, 255));
        bookName.setBorder(null);
        bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameActionPerformed(evt);
            }
        });
        jPanel1.add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, 20));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, 10));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-male-user-24.png"))); // NOI18N
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Author");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        Author.setBackground(new java.awt.Color(16, 13, 29));
        Author.setForeground(new java.awt.Color(255, 255, 255));
        Author.setBorder(null);
        Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorActionPerformed(evt);
            }
        });
        jPanel1.add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 190, 20));
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 190, 10));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 30, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/price.png"))); // NOI18N
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        Price.setBackground(new java.awt.Color(16, 13, 29));
        Price.setForeground(new java.awt.Color(255, 255, 255));
        Price.setBorder(null);
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 190, 20));
        jPanel1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 190, 10));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sugees24.png"))); // NOI18N
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("State");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        state.setBackground(new java.awt.Color(16, 13, 29));
        state.setForeground(new java.awt.Color(255, 255, 255));
        state.setBorder(null);
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });
        jPanel1.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 190, 20));
        jPanel1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 190, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publishedYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishedYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publishedYearActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        MenuAdmin obj=new MenuAdmin();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jLabel16MouseClicked

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionActionPerformed

    private void bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void addBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookMouseClicked
        try {
            // TODO add your handling code here:
            String Bname= bookName.getText();
            String author =Author.getText();
            String Pyear =publishedYear.getText();
            String price =Price.getText();
            String description =Description.getText();
            String State=state.getText();
            
            String query="insert into BOOK(bookName,author,publishedYear,price,description,state)values(?,?,?,?,?,?)";
            pst =conn.prepareStatement (query);
            pst.setString(1, Bname);
            pst.setString(2, author);
            pst.setString(3, Pyear);
            pst.setString(4, price);
            pst.setString(5, description); 
            pst.setString(6, State);
            
            if(pst.executeUpdate() !=0){
                JOptionPane.showMessageDialog(this,"Book Register Success");
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Something wrong");
            }
        } catch (SQLException ex) {
            Logger.getLogger(addBook.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_addBookMouseClicked

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

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
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JTextField Description;
    private javax.swing.JTextField Price;
    private javax.swing.JLabel addBook;
    private javax.swing.JTextField bookName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField publishedYear;
    private javax.swing.JTextField state;
    // End of variables declaration//GEN-END:variables
}
