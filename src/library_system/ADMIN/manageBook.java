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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import library_system.dbConnection;
import library_system.loginForm;

/**
 *
 * @author Mi HI Ri
 */
public class manageBook extends javax.swing.JFrame {

    /**
     * Creates new form manageBook
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public manageBook() {
        initComponents();
        conn=dbConnection.ConnecrDb();
        showTable();
    }
    
    void showTable(){
       String query="select * from BOOK";
        try {
            pst =conn.prepareStatement(query);
            rs=pst.executeQuery();
            
            while(rs.next()){
            String Bid=String.valueOf(rs.getInt("bookID"));
            String Bname=rs.getString("bookName");
            String author=rs.getString("author");
            String Pyear=String.valueOf(rs.getInt("publishedYear"));
            String Price=String.valueOf(rs.getInt("price"));
            String Description=rs.getString("description");
            
            String tbData[] ={Bid,Bname,author,Pyear,Price,Description};
            
            DefaultTableModel tblModel=(DefaultTableModel)jTablebookDetails.getModel();
            
            tblModel.addRow(tbData);
            
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(manageBook.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablebookDetails = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tableSearch = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldbName = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldauthor = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldyear = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldprice = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDescription = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        bookIdSearch = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(16, 13, 29));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageBook.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel19.setBackground(new java.awt.Color(153, 0, 0));
        jLabel19.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon close.png"))); // NOI18N
        jLabel19.setText(" Delete");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 90, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 30, -1));

        jTablebookDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author", "Published Year", "Price", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTablebookDetails);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 520, 300));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchbook.png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search Here");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        tableSearch.setBackground(new java.awt.Color(16, 13, 29));
        tableSearch.setForeground(new java.awt.Color(255, 255, 255));
        tableSearch.setBorder(null);
        tableSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableSearchActionPerformed(evt);
            }
        });
        jPanel1.add(tableSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 190, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 190, 10));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bookName.png"))); // NOI18N
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Enter Book ID");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jTextFieldbName.setBackground(new java.awt.Color(16, 13, 29));
        jTextFieldbName.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldbName.setBorder(null);
        jTextFieldbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldbNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, 20));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, 10));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-male-user-24.png"))); // NOI18N
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Author");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jTextFieldauthor.setBackground(new java.awt.Color(16, 13, 29));
        jTextFieldauthor.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldauthor.setBorder(null);
        jTextFieldauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldauthorActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 190, 20));
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 10));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/year.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Published Year");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        jTextFieldyear.setBackground(new java.awt.Color(16, 13, 29));
        jTextFieldyear.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldyear.setBorder(null);
        jTextFieldyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldyearActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 190, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 190, 10));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/price.png"))); // NOI18N
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jTextFieldprice.setBackground(new java.awt.Color(16, 13, 29));
        jTextFieldprice.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldprice.setBorder(null);
        jTextFieldprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpriceActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 190, 20));
        jPanel1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 190, 10));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/description.png"))); // NOI18N
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Description");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, 20));

        jTextFieldDescription.setBackground(new java.awt.Color(16, 13, 29));
        jTextFieldDescription.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldDescription.setBorder(null);
        jTextFieldDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 190, 40));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 190, 10));

        jLabel21.setBackground(new java.awt.Color(0, 153, 153));
        jLabel21.setFont(new java.awt.Font("Sylfaen", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signup.png"))); // NOI18N
        jLabel21.setText(" Update");
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 90, 30));

        bookIdSearch.setBackground(new java.awt.Color(16, 13, 29));
        bookIdSearch.setForeground(new java.awt.Color(255, 255, 255));
        bookIdSearch.setBorder(null);
        bookIdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdSearchActionPerformed(evt);
            }
        });
        bookIdSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookIdSearchKeyPressed(evt);
            }
        });
        jPanel1.add(bookIdSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 190, 20));
        jPanel1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 190, 10));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Book Name");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage book.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        loginForm obj=new loginForm();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void tableSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableSearchActionPerformed

    private void jTextFieldbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldbNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldbNameActionPerformed

    private void jTextFieldauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldauthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldauthorActionPerformed

    private void jTextFieldyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldyearActionPerformed

    private void jTextFieldpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpriceActionPerformed

    private void jTextFieldDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescriptionActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        DefaultTableModel bookTblModel = (DefaultTableModel)jTablebookDetails.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(bookTblModel);
        jTablebookDetails.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(tableSearch.getText().trim()));
    }//GEN-LAST:event_jLabel24MouseClicked

    private void bookIdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdSearchActionPerformed

    private void bookIdSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookIdSearchKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bookIdSearchKeyPressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         String query="select * from BOOK where bookID=?";
        String search=bookIdSearch.getText();
        
        try {
            pst=conn.prepareStatement(query);
            pst.setString(1, search);
            rs=pst.executeQuery();
            
            if(rs.next()){
                 String bookName=rs.getString("bookName");
                jTextFieldbName.setText(bookName);
                String author=rs.getString("author");
                jTextFieldauthor.setText(author);
                String pubYear=rs.getString("publishedYear");
                jTextFieldyear.setText(pubYear);
                String price=rs.getString("price");
                jTextFieldprice.setText(price);
                String description=rs.getString("description");
                jTextFieldDescription.setText(description);
            }
        } catch (SQLException ex) {
            Logger.getLogger(manageBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(manageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookIdSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTablebookDetails;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldauthor;
    private javax.swing.JTextField jTextFieldbName;
    private javax.swing.JTextField jTextFieldprice;
    private javax.swing.JTextField jTextFieldyear;
    private javax.swing.JTextField tableSearch;
    // End of variables declaration//GEN-END:variables
}
