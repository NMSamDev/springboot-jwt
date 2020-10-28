package com.grokonez.jwtauthentication.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;




@Entity
@Table(name = "poblacion", uniqueConstraints = {
        
})
public class Poblacion{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idestado;
    private Long idlocalidad;
    private Long idmunicipio;
    private Long pobfem;
    private Long pobmas;
    private Long pobtot;



   
    public Poblacion() {}

    public Poblacion(Long idestado, Long idmunicipio, Long idlocalidad,Long pobfem, Long pobmas, Long pobtot) {
        this.idestado = idestado;
        this.idlocalidad = idlocalidad;
        this.idmunicipio = idmunicipio;
        this.pobfem = pobfem;
        this.pobmas = pobmas;
        this.pobtot = pobtot;   
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
    }

    public Long getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Long idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    public Long getLocalidad() {
        return idlocalidad;
    }

    public void setLocalidad(Long idlocalidad) {
        this.idlocalidad = idlocalidad;
    }   

    public Long getpobfem() {
        return pobfem;
    }

    public void setpobfem(Long pobfem) {
        this.pobfem = pobfem;
    }

    public Long getpobmas() {
        return pobmas;
    }

    public void setpobmas(Long pobmas) {
        this.pobmas = pobmas;
    }

    public Long getpobtot() {
        return pobtot;
    }

    public void setpobtot(Long pobtot) {
        this.pobtot = pobtot;
    }

   
}