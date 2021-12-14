/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrearCuenta;

/**
 *
 * @author Gabo
 */
public class Usuario extends Persona{
    private String contraseña;
    private String mail;
    

    public Usuario() {
       
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getMail() {
        return mail;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
   
    
}
