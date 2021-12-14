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
public abstract class Persona {
    private String nombre;
    private String edad;
    private String apellido;

    public Persona() {
       
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }
    
    
    
}
