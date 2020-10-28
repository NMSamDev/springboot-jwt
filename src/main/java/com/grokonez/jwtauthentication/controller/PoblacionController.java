package com.grokonez.jwtauthentication.controller;
import java.util.List;

import com.grokonez.jwtauthentication.model.Poblacion;
import com.grokonez.jwtauthentication.repository.PoblacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class PoblacionController {

    @Autowired
    private PoblacionRepository poblacionRepository;

    @GetMapping("/poblacion")
    public List<Poblacion> getPoblacion(@RequestParam(value="idlocalidad") Long idlocalidad){
        return poblacionRepository.findPoblacion(idlocalidad);
    }
  
    
}