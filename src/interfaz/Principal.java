/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.Contraseña;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    int longitud;
    String contraseña;

    public Principal() {
        initComponents();
        cmdGuardarCon.setEnabled(true);
        cmdCambiarCon.setEnabled(false);
        cmdNiveldeseg.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdLimpiar.setEnabled(true);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cmdGuardarCon = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdNiveldeseg = new javax.swing.JButton();
        cmdCambiarCon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        txtpassContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Garamond", 3, 36)); // NOI18N
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardarCon.setText("Guardar Contraseña");
        cmdGuardarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarConActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        cmdNiveldeseg.setText("Nivel de Seguridad");
        cmdNiveldeseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNiveldesegActionPerformed(evt);
            }
        });
        jPanel2.add(cmdNiveldeseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cmdCambiarCon.setText("Cambiar Contraseña");
        cmdCambiarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarConActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCambiarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 170, 220));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 230, 90));
        jPanel1.add(txtpassContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(478, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarConActionPerformed

        Contraseña c;

        if (txtpassContraseña.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Contraseña", "error", JOptionPane.ERROR_MESSAGE);
            txtpassContraseña.requestFocusInWindow();
        } else {
            contraseña = txtpassContraseña.getText();
            longitud = contraseña.length();
            c = new Contraseña(longitud, contraseña);
            JOptionPane.showMessageDialog(this, "Contraseña guardada");

        }
        cmdCambiarCon.setEnabled(true);
        cmdNiveldeseg.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
        cmdGuardarCon.setEnabled(false);
        txtpassContraseña.setEditable(false);

    }//GEN-LAST:event_cmdGuardarConActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtpassContraseña.setText("");
        txtResultado.setText("");
        cmdGuardarCon.setEnabled(true);
        cmdCambiarCon.setEnabled(false);
        cmdNiveldeseg.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdLimpiar.setEnabled(false);
        txtpassContraseña.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdCambiarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarConActionPerformed
        
    Contraseña p;
    String nuevacon;
    int longitud;
    int jg = 1;
    do{
            
        try {
            nuevacon = JOptionPane.showInputDialog(this, "Digite una nueva contraseña");
            longitud = nuevacon.length();
            p = new Contraseña(longitud,nuevacon);
            txtpassContraseña.setText(nuevacon);
            txtResultado.setText("");
            JOptionPane.showMessageDialog(this, "Contraseña actualizada");
            jg = 1;
        } catch (NullPointerException e) {
            int res = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);
            if (res == 0) {
               jg = 1;
            }else{
               jg = 0;
            }
        }
    }
        while(jg == 0);


    }//GEN-LAST:event_cmdCambiarConActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed

        Contraseña c, p;

        contraseña = txtpassContraseña.getText();
        longitud = contraseña.length();
        c = new Contraseña(longitud, contraseña);
        p = c.mostrar();
        txtResultado.setText("Su contraseña actual es: " + c.getContraseña() + "\n"
                + "longitud de su contraseña es: " + c.getLongitud());


    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdNiveldesegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNiveldesegActionPerformed

        String c;
        Contraseña p;
        contraseña = txtpassContraseña.getText();
        longitud = contraseña.length();
        p = new Contraseña(longitud, contraseña);
        c = p.fuerza();
        txtResultado.setText(c);

    }//GEN-LAST:event_cmdNiveldesegActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCambiarCon;
    private javax.swing.JButton cmdGuardarCon;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdNiveldeseg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JPasswordField txtpassContraseña;
    // End of variables declaration//GEN-END:variables
}
