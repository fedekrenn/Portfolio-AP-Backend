package com.portfolio.fkrenn.Dto;

import javax.validation.constraints.NotBlank;


public class dtoSkills {
    
    @NotBlank
    private String nombreSkill;
    @NotBlank
    private int porcentajeSkill;
    @NotBlank
    private String colorSkill;
    
    //Cons

    public dtoSkills() {
    }

    public dtoSkills(String nombreSkill, int porcentajeSkill, String colorSkill) {
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentajeSkill;
        this.colorSkill = colorSkill;
    }
    
    //G&S

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }

    public String getColorSkill() {
        return colorSkill;
    }

    public void setColorSkill(String colorSkill) {
        this.colorSkill = colorSkill;
    }
}
