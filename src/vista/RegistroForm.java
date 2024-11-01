/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC_TONY
 */
public class RegistroForm extends javax.swing.JFrame {
    private static final String SEPARATOR = "\t";
    /**
     * Creates new form RegistroForm
     */
    public RegistroForm() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        modelo.setColumnIdentifiers(new String[]{"RUC", "Actividad", "Área", "Tipo de Licencia"});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnImportar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        txtTipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnImportar.setText("importar");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 100, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 100, 40));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 850, 340));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 100, 40));

        jLabel1.setText("Ruc:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));
        getContentPane().add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, -1));

        jLabel2.setText("Actividad: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));
        getContentPane().add(txtActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 110, -1));

        jLabel3.setText("Area: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));
        getContentPane().add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 120, -1));

        jLabel4.setText("Tipo de lincencia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Definitiva", "Temporal", "Consecionaria" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro de Licencias ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 380, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FONDITO.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
         String seleccionado = (String) cmbTipo.getSelectedItem();
         txtTipo.setText(seleccionado);
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        String rutaArchivo = "C:\\Users\\PC_TONY\\Documents\\NetBeansProjects\\LicenciasMunicipales\\LicenciasMunicipales\\licencias.txt";
    
    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
    
    // Limpiar la tabla antes de agregar nuevos datos
    modelo.setRowCount(0);
    
    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(rutaArchivo), "UTF-8"))) {
        String linea;
        
        // Leer el archivo línea por línea
        while ((linea = br.readLine()) != null) {
            // Suponiendo que los datos en cada línea están separados por comas (,)
            String[] datos = linea.split(SEPARATOR);
            
            // Agregar la línea como una nueva fila en la tabla
           if (datos.length == 4) {
                    modelo.addRow(datos);
            }
            
            
        }
        
        
    } catch (IOException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Error al leer el archivo.");
    }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        
        try {
            // Obtener datos de los campos
            String ruc = txtRuc.getText();
            String actividad = txtActividad.getText();
            String area = txtArea.getText();
            String tipo = txtTipo.getText();
            
            // Validar que los campos no estén vacíos
            if(ruc.isEmpty() || actividad.isEmpty() || area.isEmpty() || tipo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
                return;
            }
            
            // Agregar datos a la tabla
            modelo.addRow(new Object[]{ruc, actividad, area, tipo});
            
            // Agregar datos al archivo
            FileWriter fw = new FileWriter("licencias.txt", true); // true para append
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(ruc + SEPARATOR + actividad + SEPARATOR + area + SEPARATOR + tipo);
            bw.newLine();
            bw.close();
            
            // Limpiar campos
            limpiarCampos();
            
            JOptionPane.showMessageDialog(this, "Registro agregado exitosamente");
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar en el archivo: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int[] filasSeleccionadas = tablaDatos.getSelectedRows();
    
        if (filasSeleccionadas.length == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione registros para eliminar");
            return;
        }
        
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro de eliminar " + filasSeleccionadas.length + " registro(s)?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);
                
        if (confirmacion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
            // Eliminar desde el último índice para evitar problemas con los índices
            for (int i = filasSeleccionadas.length - 1; i >= 0; i--) {
                modelo.removeRow(filasSeleccionadas[i]);
            }
            actualizarArchivo();
            JOptionPane.showMessageDialog(this, "Registros eliminados exitosamente");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void actualizarArchivo() {
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("licencias.txt", false))) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                StringBuilder linea = new StringBuilder();
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    linea.append(modelo.getValueAt(i, j));
                    if (j < modelo.getColumnCount() - 1) {
                        linea.append(SEPARATOR);
                    }
                }
                bw.write(linea.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el archivo: " + e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(RegistroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroForm().setVisible(true);
            }
        });
    }
    
    private void limpiarCampos() {
        txtRuc.setText("");
        txtActividad.setText("");
        txtArea.setText("");
        txtTipo.setText("");
        txtRuc.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtActividad;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}


