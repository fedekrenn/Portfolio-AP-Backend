package com.portfolio.fkrenn.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
    @NotBlank
    private String nombrePersona;
    @NotBlank
    private String puestoPersona;
    @NotBlank
    private String ubicacionPersona;
    @NotBlank
    private String imgPersona;
    @NotBlank
    private String sobreMi;
    
    private int telPersona;
    private String emailPersona;
    private String githubPersona;
    private String linkedinPersona;
    
    //Const

    public dtoPersona() {
    }

    public dtoPersona(String nombrePersona, String puestoPersona, String ubicacionPersona, String imgPersona, String sobreMi, int telPersona, String emailPersona, String githubPersona, String linkedinPersona) {
        this.nombrePersona = nombrePersona;
        this.puestoPersona = puestoPersona;
        this.ubicacionPersona = ubicacionPersona;
        this.imgPersona = imgPersona;
        this.sobreMi = sobreMi;
        this.telPersona = telPersona;
        this.emailPersona = emailPersona;
        this.githubPersona = githubPersona;
        this.linkedinPersona = linkedinPersona;
    }
    
    //G&S

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getPuestoPersona() {
        return puestoPersona;
    }

    public void setPuestoPersona(String puestoPersona) {
        this.puestoPersona = puestoPersona;
    }

    public String getUbicacionPersona() {
        return ubicacionPersona;
    }

    public void setUbicacionPersona(String ubicacionPersona) {
        this.ubicacionPersona = ubicacionPersona;
    }

    public String getImgPersona() {
        return imgPersona;
    }

    public void setImgPersona(String imgPersona) {
        this.imgPersona = imgPersona;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public int getTelPersona() {
        return telPersona;
    }

    public void setTelPersona(int telPersona) {
        this.telPersona = telPersona;
    }

    public String getEmailPersona() {
        return emailPersona;
    }

    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }

    public String getGithubPersona() {
        return githubPersona;
    }

    public void setGithubPersona(String githubPersona) {
        this.githubPersona = githubPersona;
    }

    public String getLinkedinPersona() {
        return linkedinPersona;
    }

    public void setLinkedinPersona(String linkedinPersona) {
        this.linkedinPersona = linkedinPersona;
    }

    
}
