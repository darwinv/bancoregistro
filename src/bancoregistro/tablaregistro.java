/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoregistro;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.*;
 
import jxl.*;
import jxl.write.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class tablaregistro extends javax.swing.JFrame {

    /**
     * Creates new form tablaregistro
     */
    public tablaregistro() {
        initComponents();
        this.setLocationRelativeTo(null);
                   try
                    {       
                      Class.forName("com.mysql.jdbc.Driver");
            try (Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/bancopueblo","root", ""); Statement st = conexion.createStatement()) {
                ResultSet rs;                                               
                rs = st.executeQuery ("select * from persona");
               while (rs.next())
                {
                    //System.out.println (rs.getString("nombre") + " " + rs.getFloat ("precio")+ " " + rs.getInt("cantidad")); 
                    DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
                    
    Object nuevo[]= {rs.getString(1),rs.getString(2),rs.getString (3),rs.getString (4), rs.getString(5), rs.getString(6),
    rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)};
                    temp.addRow(nuevo);
                }
            }                      
                    } catch (ClassNotFoundException | SQLException e)
                    {
                        JOptionPane.showMessageDialog(this,e.getMessage());
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

        jDialog = new javax.swing.JDialog();
        ubic = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton4.setText("Guardar en ../ Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogLayout = new javax.swing.GroupLayout(jDialog.getContentPane());
        jDialog.getContentPane().setLayout(jDialogLayout);
        jDialogLayout.setHorizontalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ubic, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(19, 19, 19))
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel16))
                    .addGroup(jDialogLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Nombres", "Apellidos", "Cedula", "Nro cuenta", "Tipo Cuenta", "Falta Recaudo", "Falta Firma", "Celular", "Telefono", "Fecha de Apertura", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton1.setText("exportar a Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Registros");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo3.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excel.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(104, 104, 104)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(439, 439, 439)
                                .addComponent(jLabel1)))
                        .addGap(0, 383, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3))
                    .addComponent(jLabel3))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llamarJDialogExcel() {

        //Centramos nuestro jDialog
        jDialog.setLocationRelativeTo(this);
        //La hacemos modal
        jDialog.setModal(true);
        //Establecemos dimensiones.
        jDialog.setMinimumSize(new Dimension(393, 190));
        //Establecemos un título para el jDialog
        jDialog.setTitle("Imprimir en Excel");
        //La hacemos visible.
        jDialog.setVisible(true);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
llamarJDialogExcel();   
//}
    }//GEN-LAST:event_jButton1ActionPerformed
 public void llama_excel()
	 {
		 try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+ubic.getText()+".xls");
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
	 }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(this);

        if(opcion == JFileChooser.APPROVE_OPTION){

            File dir = dialog.getSelectedFile();
            String fl = dir.toString();

            ubic.setText(fl);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            List<JTable> tb = new ArrayList<>();
            tb.add(jTable1);
            //-------------------
            exportarexcel excelExporter = new exportarexcel(tb, new File(ubic.getText()+".xls"));
            if (excelExporter.export()) {
                JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        llama_excel();
        jDialog.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(tablaregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaregistro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField ubic;
    // End of variables declaration//GEN-END:variables
}
