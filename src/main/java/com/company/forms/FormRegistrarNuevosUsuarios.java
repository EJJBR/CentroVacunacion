/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.company.forms;

import com.company.models.ConexionPacVac;
import com.company.views.ConfirmarVacuna;
import com.company.views.HistorialPaciente;
import com.company.views.Inicio_Administrador;
import com.company.views.Inicio_Inventarista;
import com.company.views.Inicio_PersonalSalud;
import com.company.views.NuevoUsuario;
import com.company.views.RegistrarNuevaVacuna;
import com.company.views.UsuariosDIsponibles;
import com.company.views.VacunasDIsponibles;
import com.company.views.VacunasDIsponiblesInventaro;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.centrovacunacion.FormLogin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author HP
 */
public class FormRegistrarNuevosUsuarios extends javax.swing.JFrame {
    int xMouse;int yMouse;
    /**
     * Creates new form FormVacunarPaciente
     */
    public FormRegistrarNuevosUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        iniStyle();
        iniContent();
//        ConexionVacunasDisponibles objetoVacuna=new ConexionVacunasDisponibles();
//        objetoVacuna.mostrarVacunasDisponibles(tbTotalVacunasDisponibles);
//        ConexionPacVac objetoPacVac=new ConexionPacVac();
//        objetoPacVac.mostrarPacVac(tbHistorialMedico);
    }
    private void iniStyle(){
        lblMensaje.putClientProperty( "FlatLaf.styleClass", "font: 14$light.font" );
        lblMensaje.setForeground(Color.black);
        lblNav.putClientProperty( "FlatLaf.style", "font: bold $h3.regular.font" );
//                putClientProperty( "FlatLaf.styleClass", "font: bold $h3.regular.font" );
        lblNav.setForeground(Color.white);
        lblFecha.putClientProperty( "FlatLaf.style", "font: $h1.font" );
        lblFecha.setForeground(Color.white);
        lblSaluVax.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
        lblSaluVax.setForeground(Color.white);
        setDate();
    }
    
    private void setDate(){
        LocalDate fechaActual=LocalDate.now();
//        int año=fechaActual.getYear();
//        int mes=fechaActual.getMonthValue();
//        int dia=fechaActual.getDayOfMonth();
//        String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre",
//            "Noviembre","Diciembre"};
//        lblFecha.setText("Hoy es "+dia+" de "+meses[mes-1]+" del "+año);
        Locale spanishLocale=new Locale("es","PE");
        lblFecha.setText(fechaActual.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'del' yyyy",spanishLocale)));
    }
    private void iniContent(){
        showJPanel(new Inicio_Administrador());
        
    }
    public ConexionPacVac pacienteAVacunar(){
        HistorialPaciente pacienteAVacunar=new HistorialPaciente();
        ConexionPacVac pacAVac=pacienteAVacunar.enviarDatosPaciente();;
        return pacAVac;
    }
    public ConexionPacVac pacienteVacunado(){
        VacunasDIsponibles plConfirmar=new VacunasDIsponibles();
        ConexionPacVac pacvienteConfimar=plConfirmar.pacienteVacunado();
        return pacvienteConfimar;
    }
    public ConexionPacVac confirmarPacVac(){
        ConexionPacVac conPacVac=new ConexionPacVac();
        return conPacVac;
    }
    public static void showJPanel(JPanel pl){
        pl.setSize(1060, 398);
        pl.setLocation(0, 0);
        pnlContent.removeAll();
        pnlContent.add(pl,BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblSaluVax = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnUsuariosRegistrardos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevosUsuarios = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblNav = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1302, 620));
        setUndecorated(true);
        setResizable(false);

        backGround.setBackground(new java.awt.Color(255, 255, 255));
        backGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(13, 71, 161));
        pnlMenu.setPreferredSize(new java.awt.Dimension(270, 640));

        lblSaluVax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaluVax.setText("SaluVax");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));

        btnUsuariosRegistrardos.setBackground(new java.awt.Color(21, 101, 192));
        btnUsuariosRegistrardos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuariosRegistrardos.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuariosRegistrardos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UsuariosDIsponiblesLogo.png"))); // NOI18N
        btnUsuariosRegistrardos.setText("Usuarios registrados");
        btnUsuariosRegistrardos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 1, new java.awt.Color(0, 0, 0)));
        btnUsuariosRegistrardos.setBorderPainted(false);
        btnUsuariosRegistrardos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuariosRegistrardos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuariosRegistrardos.setIconTextGap(10);
        btnUsuariosRegistrardos.setMargin(new java.awt.Insets(2, 15, 3, 14));
        btnUsuariosRegistrardos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosRegistrardosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(21, 101, 192));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoSalir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(20);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevosUsuarios.setBackground(new java.awt.Color(21, 101, 192));
        btnNuevosUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevosUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevosUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NuevoUsuarioLogo.png"))); // NOI18N
        btnNuevosUsuarios.setText("Nuevos usuarios");
        btnNuevosUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 12, 1, 1, new java.awt.Color(0, 0, 0)));
        btnNuevosUsuarios.setBorderPainted(false);
        btnNuevosUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevosUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevosUsuarios.setIconTextGap(15);
        btnNuevosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevosUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUsuariosRegistrardos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnNuevosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaluVax, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSaluVax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuariosRegistrardos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnNuevosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        backGround.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 620));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        backGround.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 216, -1, -1));

        pnlHeader.setBackground(new java.awt.Color(25, 118, 210));
        pnlHeader.setPreferredSize(new java.awt.Dimension(744, 150));

        lblNav.setText("Administracion/Control/Usuarios");

        lblFecha.setText("Hoy es {dia} de {mes} del {año}");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNav)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblNav)
                .addGap(35, 35, 35)
                .addComponent(lblFecha)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        backGround.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 60, 1073, -1));

        lblMensaje.setText("Saludos aqui podra buscar manipular los datos de los usuarios disponibles y registrar nuevos.");
        backGround.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 20, 758, 28));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        backGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevosUsuariosActionPerformed
        // TODO add your handling code here:
        showJPanel(new NuevoUsuario());
    }//GEN-LAST:event_btnNuevosUsuariosActionPerformed

    private void btnUsuariosRegistrardosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosRegistrardosActionPerformed
        // TODO add your handling code here:
        showJPanel(new UsuariosDIsponibles());
    }//GEN-LAST:event_btnUsuariosRegistrardosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        FormLogin logeo=new FormLogin();
        logeo.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistrarNuevosUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backGround;
    private javax.swing.JButton btnNuevosUsuarios;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUsuariosRegistrardos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNav;
    private javax.swing.JLabel lblSaluVax;
    public static javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
