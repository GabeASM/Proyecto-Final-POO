/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrearCuenta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login_trabajo.ConexionMYSQL;
//import InterfazConectable;

/**
 *
 * @author Gabo
 */
public class SqlUsuario extends ConexionMYSQL {
    
    public boolean registar(Usuario a){
        
      
        PreparedStatement ps = null;
        Connection con = ConexionSqlUsuario();
        
        String SQL = "INSERT INTO usuario (nombre,contraseña,email) VALUES(?,?,?)";
       try{
           
           ps = con.prepareStatement(SQL);
           ps.setString(1, a.getNombre());
           ps.setString(2, a.getContraseña());
           ps.setString(3, a.getMail());
           
           ps.execute();
                   return true;
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
            return false;
        }
        
        
       
    }
    
    
}
