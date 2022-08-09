package com.portfolio.fkrenn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrePersona;
    private String puestoPersona;
    private String ubicacionPersona;
    private String imgPersona;
    private String sobreMi;
    private int telPersona;
    private String emailPersona;
    private String githubPersona;
    private String linkedinPersona;

    //Const
    public Persona() {
    }

    public Persona(String nombrePersona, String puestoPersona, String ubicacionPersona, String imgPersona, String sobreMi, int telPersona, String emailPersona, String githubPersona, String linkedinPersona) {
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

    // G&S
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
