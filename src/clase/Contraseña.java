/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Administrador
 */
public class Contraseña {
    private int longitud;
    private String contraseña;
    
    public Contraseña(){
        this.longitud=8;
    }
    
    public Contraseña (int longitud,String contraseña){
        this.longitud=longitud;
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contra) {
        this.contraseña = contraseña;
    }   
    
    public String fuerza(){
        
        String f;
        if (this.longitud >= 8) {
            f="La contraseña actual es fuerte";
        }
        else{
            f="La contraseña actual es muy debil";
        }
        return f;
    }
    
    public Contraseña mostrar(){
       Contraseña pass;
       String mos;
       int longitud;
       mos=this.contraseña;
       longitud=this.longitud;
       pass=new Contraseña(longitud,mos);
       return pass;
    }
    
    public Contraseña CambiarContraseña(){
        Contraseña nc;
        int longitud = this.longitud;
        String contraseña = this.contraseña;
        nc = new Contraseña(longitud,contraseña);
        return nc;
        
    }

    
    }


