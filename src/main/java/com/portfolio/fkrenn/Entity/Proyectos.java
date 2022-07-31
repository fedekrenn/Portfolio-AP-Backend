package com.portfolio.fkrenn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreProyecto;
    private String urlRepo;
    private String urlDeploy;
    private String imgProyecto;
    private String descripcionProyecto;
    
    //Const

    public Proyectos() {
    }

    public Proyectos(String nombreProyecto, String urlRepo, String urlDeploy, String imgProyecto, String descripcionProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.urlRepo = urlRepo;
        this.urlDeploy = urlDeploy;
        this.imgProyecto = imgProyecto;
        this.descripcionProyecto = descripcionProyecto;
    }
    
    //G&S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
