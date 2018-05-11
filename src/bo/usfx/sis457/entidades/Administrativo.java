/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Marcelo
 */
public class Administrativo extends Persona {
    protected String Cargo;
    protected String LugarTrabajo;
    protected Calendar FechaIngreso;
    
    public Administrativo(String cargo, String lugarTrabajo, Calendar fechaIngreso, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(carnetIdentidad, nombre, fechaNacimiento);
        this.Cargo = cargo;
        this.LugarTrabajo = lugarTrabajo;
        this.FechaIngreso = fechaIngreso;
        //System.out.println("Se crea un Administrativo");
    }
    
    public Administrativo(String cargo, String lugarTrabajo, Calendar fechaIngreso) {
        super();
        this.Cargo = cargo;
        this.LugarTrabajo = lugarTrabajo;
        this.FechaIngreso = fechaIngreso;
        //System.out.println("Se crea un Administrativo");
    }
    
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }
    
    public String getLugartrabajo() {
        return LugarTrabajo;
    }
    
    public void setLugarTrabajo(String lugarTrabajo) {
        this.LugarTrabajo = lugarTrabajo;
    }

    public void setSemestre(String lugarTrabajo) {
        this.LugarTrabajo = lugarTrabajo;
    }
    
    public Calendar getFechaIngreso() {
        return FechaIngreso;
    }
    
    public void setFechaIngreso(Calendar fechaIngreso) {
        this.FechaIngreso = fechaIngreso;
    }
    
    @Override
    public String toString() {
        return "Administrativo{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Cargo=" + this.Cargo 
                + ", LugarTrabajo=" + this.LugarTrabajo
                + ", FechaIngreso="+ Utilitarios.getFechaCalendario(this.FechaIngreso) + '}';
    }
}
