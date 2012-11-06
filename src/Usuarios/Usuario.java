/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Auditor3
 */
public class Usuario {
 
    protected String nombre;
    protected String user;
    protected String pass;
    protected boolean credencial;
    
    public Usuario(String nombre, String user, String pass){
        this.nombre=nombre;
        this.user=user;
        this.pass=pass;
        credencial=true;
    }
    
    
    
}
