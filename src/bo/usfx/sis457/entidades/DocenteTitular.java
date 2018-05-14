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
public class DocenteTitular extends Docente {
    protected String ExamenCompetencia;
    
    public DocenteTitular(String examenCompetencia, String titulo, int añosExperiencia, String[] asignaturas, String carnetIdentidad, String nombre, Calendar fechaNacimiento) {
        super(titulo, añosExperiencia, asignaturas, carnetIdentidad, nombre, fechaNacimiento);
        this.ExamenCompetencia = examenCompetencia;
    }
    
    public DocenteTitular(String examenCompetencia) {
        this.ExamenCompetencia = examenCompetencia;
    }
    
    public String getExamenCompetencia(){
        return ExamenCompetencia;
    }
    
    public void setExamenCompetencia(String examenCompetencia){
        this.ExamenCompetencia = examenCompetencia;
    }
    
    @Override
    public String toString() {
        return "DocenteTitular{" 
                + "Id=" + this.Id 
                + ", CarnetIdentidad=" + this.CarnetIdentidad 
                + ", Nombre=" + this.Nombre 
                + ", FechaNacimiento=" + Utilitarios.getFechaCalendario(this.FechaNacimiento)
                + ", Titulo=" + this.Titulo
                + ", AñosExperiencia" + this.AñosExperiencia
                + ", Asignaturas" + Arrays.toString(this.Asignaturas) 
                + ", ExamenCompetencia" + this.ExamenCompetencia + '}';
    }
    
}
