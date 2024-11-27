/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

public class PrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalForm
     */
    public PrincipalForm() {
        initComponents();
        this.setSize(1440,900);
        setLocationRelativeTo(null);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnMinimizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        btnbusqueda = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setFocusable(false);
        jDesktopPane1.setVerifyInputWhenFocusTarget(false);
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnMinimizar.setText("-");
        btnMinimizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 70, 50));

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSalir.setText("X");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 20, 70, 50));

        jTextField2.setBackground(new java.awt.Color(236, 236, 236));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 153, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("BIENVENIDO");
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 80));

        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 50));

        btnbusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busqueda.png"))); // NOI18N
        btnbusqueda.setText("Busqueda");
        btnbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusquedaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 120, 50));

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoleft.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 890));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo Big.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 1320, 890));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1473, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );

        jDesktopPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(new Color(255, 247, 83) );
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(new Color(255,255,255) );
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(PrincipalForm.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255, 69, 69) );
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(255,204,204) );
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
    
        RegistroForm registroForm = new RegistroForm();
        registroForm.setVisible(true);
        registroForm.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusquedaActionPerformed
        BusquedaForm busquedaForm = new BusquedaForm();
        busquedaForm.setVisible(true);
        busquedaForm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnbusquedaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        ReportesForm reportesForm = new ReportesForm();
        reportesForm.setVisible(true);
        reportesForm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportesActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnbusqueda;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
