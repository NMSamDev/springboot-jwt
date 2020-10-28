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
@Table(name = "localidades", uniqueConstraints = {
        
})
public class Localidad{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idestado;
    private Long idmunicipio;
    private Long idlocalidad;

    @NotBlank
    @Size(min=3, max = 100)
    private String localidad;


   
    public Localidad() {}

    public Localidad(Long idestado, Long idmunicipio, Long idlocalidad, String localidad) {
        this.idestado = idestado;
        this.idmunicipio = idmunicipio;
        this.idlocalidad = idlocalidad;
        this.localidad = localidad;
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

    public String getlocalidad() {
        return localidad;
    }

    public void setMunicipio(String localidad) {
        this.localidad = localidad;
    }   

    public Long getIdlocalidad() {
        return idlocalidad;
    }

    public void setIdlocalidad(Long idlocalidad) {
        this.idlocalidad = idlocalidad;
    }

   
}