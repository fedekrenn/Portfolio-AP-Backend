
package com.portfolio.fkrenn.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreExperiencia;
    @Column(length=1000)
    private String descripcionExperiencia;
    private String compania;
    private String imgExp;
    private int startExp;
    private String endExp;
    
    //Const

    public Experiencia() {
    }

    public Experiencia(String nombreExperiencia, String descripcionExperiencia, String compania, String imgExp, int startExp, String endExp) {
        this.nombreExperiencia = nombreExperiencia;
        this.descripcionExperiencia = descripcionExperiencia;
        this.compania = compania;
        this.imgExp = imgExp;
        this.startExp = startExp;
        this.endExp = endExp;
    }
    
    //G&S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
    }
    
    public String getCompania() {
        return compania;
    }
    
    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

    public int getStartExp() {
        return startExp;
    }

    public void setStartExp(int startExp) {
        this.startExp = startExp;
    }

    public String getEndExp() {
        return endExp;
    }

    public void setEndExp(String endExp) {
        this.endExp = endExp;
    }
       
}
