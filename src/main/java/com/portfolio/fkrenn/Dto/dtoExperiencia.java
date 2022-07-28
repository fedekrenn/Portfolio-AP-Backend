package com.portfolio.fkrenn.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    
    @NotBlank
    private String nombreExperiencia;
    @NotBlank
    private String descripcionExperiencia;
    @NotBlank
    private String compania;
    @NotBlank
    private String imgExp;
    @NotBlank
    private int startExp;
    @NotBlank
    private String endExp;
    
    
    //Const

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreExperiencia, String descripcionExperiencia, String compania, String imgExp, int startExp, String endExp) {
        this.nombreExperiencia = nombreExperiencia;
        this.descripcionExperiencia = descripcionExperiencia;
        this.compania = compania;
        this.imgExp = imgExp;
        this.startExp = startExp;
        this.endExp = endExp;
    }
    
    //G&S

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
