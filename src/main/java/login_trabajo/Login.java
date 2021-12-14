/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_trabajo;

import Chat.PanelCliente;
import CrearCuenta.CrearCuenta1;
import CrearCuenta.Hash;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabo
 */
public class Login extends javax.swing.JFrame {



    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jColorChooser3 = new javax.swing.JColorChooser();
        jPanel2 = new javax.swing.JPanel();
        Fondo = new javax.swing.JPanel();
        Loging = new javax.swing.JPanel();
        NombreProyecto = new javax.swing.JLabel();
        panelIngresar = new javax.swing.JPanel();
        CrearCuentaBoton = new javax.swing.JButton();
        JPANELENTRAR1 = new javax.swing.JPanel();
        IngresarBoton1 = new javax.swing.JButton();
        Resto = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        Iniciar_sesion1 = new javax.swing.JLabel();
        separador_usuario = new javax.swing.JSeparator();
        ContraseñaText = new javax.swing.JLabel();
        Txtusuario = new javax.swing.JTextField();
        Separador_password = new javax.swing.JSeparator();
        Txtcontraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(214, 12, 245));
        setLocationByPlatform(true);
        setResizable(false);

        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loging.setBackground(new java.awt.Color(247, 0, 142));

        NombreProyecto.setBackground(new java.awt.Color(255, 255, 255));
        NombreProyecto.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        NombreProyecto.setForeground(new java.awt.Color(255, 255, 255));
        NombreProyecto.setText("ChadChat");

        panelIngresar.setBackground(new java.awt.Color(79, 0, 63));

        CrearCuentaBoton.setBackground(new java.awt.Color(79, 0, 63));
        CrearCuentaBoton.setForeground(new java.awt.Color(255, 255, 255));
        CrearCuentaBoton.setText("REGISTRARSE");
        CrearCuentaBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearCuentaBotonMouseClicked(evt);
            }
        });
        CrearCuentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentaBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresarLayout = new javax.swing.GroupLayout(panelIngresar);
        panelIngresar.setLayout(panelIngresarLayout);
        panelIngresarLayout.setHorizontalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresarLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(CrearCuentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        panelIngresarLayout.setVerticalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrearCuentaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        JPANELENTRAR1.setBackground(new java.awt.Color(79, 0, 63));

        IngresarBoton1.setBackground(new java.awt.Color(79, 0, 63));
        IngresarBoton1.setForeground(new java.awt.Color(255, 255, 255));
        IngresarBoton1.setText("INGRESAR");
        IngresarBoton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarBoton1MouseClicked(evt);
            }
        });
        IngresarBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBoton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPANELENTRAR1Layout = new javax.swing.GroupLayout(JPANELENTRAR1);
        JPANELENTRAR1.setLayout(JPANELENTRAR1Layout);
        JPANELENTRAR1Layout.setHorizontalGroup(
            JPANELENTRAR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPANELENTRAR1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(IngresarBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        JPANELENTRAR1Layout.setVerticalGroup(
            JPANELENTRAR1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngresarBoton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout LogingLayout = new javax.swing.GroupLayout(Loging);
        Loging.setLayout(LogingLayout);
        LogingLayout.setHorizontalGroup(
            LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogingLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogingLayout.createSequentialGroup()
                    .addContainerGap(98, Short.MAX_VALUE)
                    .addComponent(JPANELENTRAR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(85, 85, 85)))
        );
        LogingLayout.setVerticalGroup(
            LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogingLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(NombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(panelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(LogingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogingLayout.createSequentialGroup()
                    .addContainerGap(277, Short.MAX_VALUE)
                    .addComponent(JPANELENTRAR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(116, 116, 116)))
        );

        Fondo.add(Loging, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 370, 430));

        Resto.setBackground(new java.awt.Color(80, 0, 65));

        Usuario.setBackground(new java.awt.Color(187, 187, 187));
        Usuario.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("USUARIO");

        Iniciar_sesion1.setBackground(new java.awt.Color(255, 255, 255));
        Iniciar_sesion1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        Iniciar_sesion1.setForeground(new java.awt.Color(255, 255, 255));
        Iniciar_sesion1.setText("INICIAR SESIÓN");

        ContraseñaText.setBackground(new java.awt.Color(187, 187, 187));
        ContraseñaText.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ContraseñaText.setForeground(new java.awt.Color(255, 255, 255));
        ContraseñaText.setText("CONTRASEÑA");

        Txtusuario.setBackground(new java.awt.Color(79, 0, 63));
        Txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        Txtusuario.setText("Ingrese su nombre de usuario");
        Txtusuario.setBorder(null);
        Txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtusuarioMousePressed(evt);
            }
        });
        Txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtusuarioActionPerformed(evt);
            }
        });

        Txtcontraseña.setBackground(new java.awt.Color(79, 0, 63));
        Txtcontraseña.setForeground(new java.awt.Color(204, 204, 204));
        Txtcontraseña.setText("jPasswordField1");
        Txtcontraseña.setBorder(null);
        Txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtcontraseñaMousePressed(evt);
            }
        });
        Txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcontraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RestoLayout = new javax.swing.GroupLayout(Resto);
        Resto.setLayout(RestoLayout);
        RestoLayout.setHorizontalGroup(
            RestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(RestoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(RestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RestoLayout.createSequentialGroup()
                        .addGroup(RestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContraseñaText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(RestoLayout.createSequentialGroup()
                                .addComponent(separador_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 56, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(RestoLayout.createSequentialGroup()
                        .addGroup(RestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Separador_password, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RestoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Txtcontraseña)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(RestoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Iniciar_sesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RestoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(RestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RestoLayout.createSequentialGroup()
                        .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Txtusuario))
                .addContainerGap())
        );
        RestoLayout.setVerticalGroup(
            RestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RestoLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(Iniciar_sesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContraseñaText, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(Txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separador_password, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        Fondo.add(Resto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 430));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtusuarioMousePressed
        if (Txtusuario.getText().equals("Ingrese su nombre de usuario")) {
            Txtusuario.setText("");
            Txtusuario.setForeground(Color.gray);

        }
        if (String.valueOf(Txtcontraseña.getPassword()).isEmpty()) {
            Txtcontraseña.setText("***********");
            Txtcontraseña.setForeground(Color.white);

        }

    }//GEN-LAST:event_TxtusuarioMousePressed

    private void CrearCuentaBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCuentaBotonMouseClicked
        
        CrearCuenta1 c1 = new CrearCuenta1();
        c1.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_CrearCuentaBotonMouseClicked

    private void IngresarBoton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBoton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarBoton1MouseClicked

    private void CrearCuentaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentaBotonActionPerformed

    }//GEN-LAST:event_CrearCuentaBotonActionPerformed

    private void TxtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtusuarioActionPerformed

    private void TxtcontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtcontraseñaMousePressed
      if (String.valueOf(Txtcontraseña.getPassword()).equals("***********")) {
            Txtcontraseña.setText("");
            Txtcontraseña.setForeground(Color.gray);
            
        }
        if (Txtusuario.getText().isEmpty()) {
            Txtusuario.setText("Ingrese su nombre de usuario");
            Txtusuario.setForeground(Color.gray);
            Txtcontraseña.setText("");
            Txtcontraseña.setForeground(Color.gray);
            
        }

    }//GEN-LAST:event_TxtcontraseñaMousePressed

    private void TxtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcontraseñaActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_TxtcontraseñaActionPerformed

    private void IngresarBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBoton1ActionPerformed
        // TODO add your handling code here:
             try{
          ConexionMYSQL Con = new ConexionMYSQL();
          String u = Txtusuario.getText();
          String p = Txtcontraseña.getText();
          Con.ConectarBasedeDatos();
          
          //**********************
          //El pass se encripta de nuevo xd
          String nuevoPass = Hash.sha1(p);
          
          //**********************
          
          String SQL = "SELECT nombre, contraseña FROM usuario " + "WHERE nombre='"+u+"' AND contraseña='"+nuevoPass+"'";
          
          Con.resultado = Con.sentencia.executeQuery(SQL);
          if (Con.resultado.next()) {
              setVisible(false);
                 //Menu menu = new Menu();
                 // menu.Lbusuario.setText(""+ Con.resultado.getString("nombre"));
                 //menu.setVisible(true);
                 PanelCliente panelCliente = new PanelCliente(Txtusuario.getText());
                 panelCliente.setVisible(true);
              
          }
          else{
              JOptionPane.showMessageDialog(null, "Usuario o contraseña invalido");
          }
          
      }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_IngresarBoton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContraseñaText;
    private javax.swing.JButton CrearCuentaBoton;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton IngresarBoton1;
    private javax.swing.JLabel Iniciar_sesion1;
    private javax.swing.JPanel JPANELENTRAR1;
    private javax.swing.JPanel Loging;
    private javax.swing.JLabel NombreProyecto;
    private javax.swing.JPanel Resto;
    private javax.swing.JSeparator Separador_password;
    private javax.swing.JPasswordField Txtcontraseña;
    private javax.swing.JTextField Txtusuario;
    private javax.swing.JLabel Usuario;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelIngresar;
    private javax.swing.JSeparator separador_usuario;
    // End of variables declaration//GEN-END:variables
}
