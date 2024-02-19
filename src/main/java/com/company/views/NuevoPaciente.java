/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.company.views;

import com.company.forms.FormVacunarPaciente;
import com.company.models.ConexionPacVac;
import com.company.models.ConexionVacunasDisponibles;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class NuevoPaciente extends javax.swing.JPanel {

    /**
     * Creates new form Inicio_PersonalSalud
     */
    public NuevoPaciente() {
        initComponents();
        initStyle();
//        ConexionPacVac objetoPacVac=new ConexionPacVac();
//        objetoPacVac.mostrarPacVac(tbHistorialMedico);
    }

    private void initStyle() {
        lblBienvenido.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        lblBienvenido.setForeground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        lblBienvenido = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCalendarFechaNac = new com.toedter.calendar.JCalendar();

        setPreferredSize(new java.awt.Dimension(1060, 524));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 410, 20));

        lblBienvenido.setText("Bien, llegados aqui se nescesita confirmar si todos los datos ingresados en las partes anteriores son los correctos para poder registrarlos.");
        bg.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 32));

        txtDni.setForeground(new java.awt.Color(204, 204, 204));
        txtDni.setText("Digiete el DNI del paciente");
        txtDni.setBorder(null);
        txtDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDniMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDniMousePressed(evt);
            }
        });
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        bg.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 410, 20));

        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Digite el nombre(s) del paciente");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 410, 20));

        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("Digite los apellidos del paciente");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        bg.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 410, 20));

        txtDireccion.setForeground(new java.awt.Color(204, 204, 204));
        txtDireccion.setText("Digite la direccion del paciente");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        bg.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 410, 20));

        txtCelular.setForeground(new java.awt.Color(204, 204, 204));
        txtCelular.setText("Digite algun telefono de contacto del paciente");
        txtCelular.setBorder(null);
        txtCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCelularMousePressed(evt);
            }
        });
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        bg.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 410, 20));

        txtFechaNac.setEditable(false);
        txtFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNac.setForeground(new java.awt.Color(204, 204, 204));
        txtFechaNac.setText("Fecha de nacimeinto");
        txtFechaNac.setBorder(null);
        txtFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacActionPerformed(evt);
            }
        });
        bg.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 150, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setText("Nacimiento:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 410, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("Apellido:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 410, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 410, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("Celular:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 410, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setText("Direccion:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("DNI:");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, 20));

        btnConfirmar.setBackground(new java.awt.Color(21, 101, 192));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Registrar nuevo paciente");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        bg.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 210, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagenRNP.jpg"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 46, 510, 360));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 10, 330));

        jCalendarFechaNac.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarFechaNacPropertyChange(evt);
            }
        });
        bg.add(jCalendarFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 260, 140));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1062, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        if (!txtDni.getText().equals("Digiete el DNI del paciente")) {
            if (!txtNombre.getText().equals("Digite el nombre(s) del paciente")) {
                if (!txtApellido.getText().equals("Digite los apellidos del paciente")) {
                    if (!txtDireccion.getText().equals("Digite la direccion del paciente")) {
                        if (!txtCelular.getText().equals("Digite algun telefono de contacto del paciente")) {
                            if (!txtFechaNac.getText().equals("Fecha de nacimeinto")) {
                                ConexionPacVac pacVac = new ConexionPacVac(txtDni.getText(), txtNombre.getText(),
                                        txtApellido.getText(), txtDireccion.getText(), txtCelular.getText(),
                                        txtFechaNac.getText());
                                FormVacunarPaciente.showJPanel(new VacunasDIsponibles(pacVac));
                            } else {
                                JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jCalendarFechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarFechaNacPropertyChange
        // TODO add your handling code here:
        if (evt.getOldValue() != null) {
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            txtFechaNac.setText(fecha.format(jCalendarFechaNac.getCalendar().getTime()));
            txtFechaNac.setForeground(Color.black);
        }
    }//GEN-LAST:event_jCalendarFechaNacPropertyChange

    private void txtDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniMouseClicked

    private void txtDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniMousePressed
        // TODO add your handling code here:
        if (txtDni.getText().equals("Digiete el DNI del paciente")) {
            txtDni.setText("");
            txtDni.setForeground(Color.BLACK);
        }
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDireccion.getText().isEmpty()
                || txtCelular.getText().isEmpty()) {
            txtNombre.setText("Digite el nombre(s) del paciente");
            txtNombre.setForeground(new Color(204, 204, 204));
            txtApellido.setText("Digite los apellidos del paciente");
            txtApellido.setForeground(new Color(204, 204, 204));
            txtDireccion.setText("Digite la direccion del paciente");
            txtDireccion.setForeground(new Color(204, 204, 204));
            txtCelular.setText("Digite algun telefono de contacto del paciente");
            txtCelular.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtDniMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // TODO add your handling code here:
        if (txtNombre.getText().equals("Digite el nombre(s) del paciente")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.BLACK);
        }
        if (txtDni.getText().isEmpty() || txtApellido.getText().isEmpty() || txtDireccion.getText().isEmpty()
                || txtCelular.getText().isEmpty()) {
            txtDni.setText("Digiete el DNI del paciente");
            txtDni.setForeground(new Color(204, 204, 204));
            txtApellido.setText("Digite los apellidos del paciente");
            txtApellido.setForeground(new Color(204, 204, 204));
            txtDireccion.setText("Digite la direccion del paciente");
            txtDireccion.setForeground(new Color(204, 204, 204));
            txtCelular.setText("Digite algun telefono de contacto del paciente");
            txtCelular.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        // TODO add your handling code here:
        if (txtApellido.getText().equals("Digite los apellidos del paciente")) {
            txtApellido.setText("");
            txtApellido.setForeground(Color.BLACK);
        }
        if (txtDni.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty()
                || txtCelular.getText().isEmpty()) {
            txtDni.setText("Digiete el DNI del paciente");
            txtDni.setForeground(new Color(204, 204, 204));
            txtNombre.setText("Digite el nombre(s) del paciente");
            txtNombre.setForeground(new Color(204, 204, 204));
            txtDireccion.setText("Digite la direccion del paciente");
            txtDireccion.setForeground(new Color(204, 204, 204));
            txtCelular.setText("Digite algun telefono de contacto del paciente");
            txtCelular.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        // TODO add your handling code here:
        if (txtDireccion.getText().equals("Digite la direccion del paciente")) {
            txtDireccion.setText("");
            txtDireccion.setForeground(Color.BLACK);
        }
        if (txtDni.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty()
                || txtCelular.getText().isEmpty()) {
            txtDni.setText("Digiete el DNI del paciente");
            txtDni.setForeground(new Color(204, 204, 204));
            txtNombre.setText("Digite el nombre(s) del paciente");
            txtNombre.setForeground(new Color(204, 204, 204));
            txtApellido.setText("Digite los apellidos del paciente");
            txtApellido.setForeground(new Color(204, 204, 204));
            txtCelular.setText("Digite algun telefono de contacto del paciente");
            txtCelular.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtCelularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCelularMousePressed
        // TODO add your handling code here:
        if (txtCelular.getText().equals("Digite algun telefono de contacto del paciente")) {
            txtCelular.setText("");
            txtCelular.setForeground(Color.BLACK);
        }
        if (txtDni.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty()
                || txtDireccion.getText().isEmpty()) {
            txtDni.setText("Digiete el DNI del paciente");
            txtDni.setForeground(new Color(204, 204, 204));
            txtNombre.setText("Digite el nombre(s) del paciente");
            txtNombre.setForeground(new Color(204, 204, 204));
            txtApellido.setText("Digite los apellidos del paciente");
            txtApellido.setForeground(new Color(204, 204, 204));
            txtDireccion.setText("Digite la direccion del paciente");
            txtDireccion.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtCelularMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnConfirmar;
    private com.toedter.calendar.JCalendar jCalendarFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
