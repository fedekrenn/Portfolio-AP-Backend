package com.portfolio.fkrenn.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyectos {
    
    @NotBlank
    private String nombreProyecto;
    @NotBlank
    private String urlRepo;
    @NotBlank
    private String urlDeploy;
    @NotBlank
    private String imgProyecto;
    @NotBlank
    private String descripcionProyecto;
    
    //Const

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreProyecto, String urlRepo, String urlDeploy, String imgProyecto, String descripcionProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.urlRepo = urlRepo;
        this.urlDeploy = urlDeploy;
        this.imgProyecto = imgProyecto;
        this.descripcionProyecto = descripcionProyecto;
    }
    
    //G&S

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getUrlRepo() {
        return urlRepo;
    }

    public void setUrlRepo(String urlRepo) {
        this.urlRepo = urlRepo;
    }

    public String getUrlDeploy() {
        return urlDeploy;
    }

    public void setUrlDeploy(String urlDeploy) {
        this.urlDeploy = urlDeploy;
    }

    public String getImgProyecto() {
        return imgProyecto;
    }

    public void setImgProyecto(String imgProyecto) {
        this.imgProyecto = imgProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }
}
