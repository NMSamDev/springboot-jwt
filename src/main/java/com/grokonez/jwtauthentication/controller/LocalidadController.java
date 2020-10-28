package com.grokonez.jwtauthentication.controller;
import java.util.List;

import com.grokonez.jwtauthentication.model.Localidad;
import com.grokonez.jwtauthentication.repository.LocalidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class LocalidadController {

    @Autowired
    private LocalidadRepository localidadRepository;

    @GetMapping("/localidad")
    public List<Localidad> getLocalidades(@RequestParam(value="idmunicipio") Long idmunicipio, @RequestParam(value="idestado") Long idestado){
        return localidadRepository.findLocalidadesByMunicipios(idmunicipio, idestado);
    }
  
    
}
