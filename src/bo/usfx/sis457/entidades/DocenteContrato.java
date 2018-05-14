/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.entidades;

import bo.usfx.sis457.Utilitarios;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author lenovo
 */
public class DocenteContrato extends Docente {
    protected String NumeroContrato;
    
    public DocenteContrato(String numeroContrato, String titulo, int añosExperiencia, String[] asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(titulo, añosExperiencia, asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.NumeroContrato = numeroContrato;
    }
    
    public DocenteContrato(String numeroContrato) {
        this.NumeroContrato = numeroContrato;
    }
    
    public String getExamenCompetencia(){
        return NumeroContrato;
    }
    
    public void setExamenCompetencia(String numeroContrato){
        this.NumeroContrato = numeroContrato;
    }
    
    @Override
    public String toString() {
        return "DocenteContrato{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + this.Titulo
                + ", AñosExperiencia" + this.AñosExperiencia
                + ", Asignaturas" + Arrays.toString(this.Asignaturas) 
                + ", NumeroContrato" + this.NumeroContrato + '}';
    }
    
}
