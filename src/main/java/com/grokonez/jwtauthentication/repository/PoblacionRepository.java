package com.grokonez.jwtauthentication.repository;
import java.util.List;

import com.grokonez.jwtauthentication.model.Poblacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface PoblacionRepository extends JpaRepository<Poblacion, Long> {
    
    @Query(value = "select NEW com.grokonez.jwtauthentication.model.Poblacion(c.idestado,c.idmunicipio,c.idlocalidad, c.pobfem,c.pobmas,c.pobtot) from Poblacion c where c.idlocalidad=?1 order by c.idlocalidad")
    List<Poblacion> findPoblacion(Long idlocalidad);

}