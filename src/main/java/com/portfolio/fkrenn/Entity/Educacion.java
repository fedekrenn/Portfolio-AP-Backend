
package com.portfolio.fkrenn.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreEducacion;
    @Column(length=1000)
    private String descripcionEducacion;
    private String establecimiento;
    private String imgEducacion;
    private int startEducacion;
    private String endEducacion;

    
    //Const
    public Educacion() {
    }

    public Educacion(String nombreEducacion, String descripcionEducacion, String establecimiento, String imgEducacion, int startEducacion, String endEducacion) {
        this.nombreEducacion = nombreEducacion;
        this.descripcionEducacion = descripcionEducacion;
        this.establecimiento = establecimiento;
        this.imgEducacion = imgEducacion;
        this.startEducacion = startEducacion;
        this.endEducacion = endEducacion;
    }
    
    //G&S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEducacion() {
        return nombreEducacion;
    }

    public void setNombreEducacion(String nombreEducacion) {
        this.nombreEducacion = nombreEducacion;
    }

    public String getDescripcionEducacion() {
        return descripcionEducacion;
    }

    public void setDescripcionEducacion(String descripcionEducacion) {
        this.descripcionEducacion = descripcionEducacion;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getImgEducacion() {
        return imgEducacion;
    }

    public void setImgEducacion(String imgEducacion) {
        this.imgEducacion = imgEducacion;
    }

    public int getStartEducacion() {
        return startEducacion;
    }

    public void setStartEducacion(int startEducacion) {
        this.startEducacion = startEducacion;
    }

    public String getEndEducacion() {
        return endEducacion;
    }

    public void setEndEducacion(String endEducacion) {
        this.endEducacion = endEducacion;
    }   
}
