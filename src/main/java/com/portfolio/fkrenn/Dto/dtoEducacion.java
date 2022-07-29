package com.portfolio.fkrenn.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    
    @NotBlank
    private String nombreEducacion;
    @NotBlank
    private String descripcionEducacion;
    @NotBlank
    private String establecimiento;
    @NotBlank
    private String imgEducacion;
    @NotBlank
    private int startEducacion;
    @NotBlank
    private String endEducacion;
    
    //Const

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEducacion, String descripcionEducacion, String establecimiento, String imgEducacion, int startEducacion, String endEducacion) {
        this.nombreEducacion = nombreEducacion;
        this.descripcionEducacion = descripcionEducacion;
        this.establecimiento = establecimiento;
        this.imgEducacion = imgEducacion;
        this.startEducacion = startEducacion;
        this.endEducacion = endEducacion;
    }
    
    //G&S

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
