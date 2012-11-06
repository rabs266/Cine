/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

import java.util.Date;

/**
 *
 * @author Auditor3
 */
public class Pelicula {
    protected int cod;
    protected String titulo;
    protected double dura;
    protected TipoPelicula genero;
    protected TipoClasificacion clasi;
    protected Date fecha;
    
    //Esta pendiente lo de cargar la foto, cada pelicula debe llevar su foto.
    
    public Pelicula(int cod, String titulo, double dura, TipoPelicula genero, TipoClasificacion clasi){
        this.cod=cod;
        this.titulo=titulo;
        this.dura=dura;
        this.genero=genero;
        this.clasi=clasi;
        fecha=new Date();
    }

    public TipoClasificacion getClasi() {
        return clasi;
    }

    public int getCod() {
        return cod;
    }

    public double getDura() {
        return dura;
    }

    public Date getFecha() {
        return fecha;
    }

    public TipoPelicula getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }
    
    @Override
    public String toString(){
        return "Codigo: "+cod+" Titulo: "+titulo+" Duracion: "+dura;
    }
    
}
