
package com.grokonez.jwtauthentication.repository;
import java.util.List;

import com.grokonez.jwtauthentication.model.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
    
    @Query(value = "select NEW com.grokonez.jwtauthentication.model.Localidad(c.idestado,c.idmunicipio,c.idlocalidad,c.localidad) from Localidad c where c.idmunicipio=?1 AND c.idestado=?2 order by c.idmunicipio")
List<Localidad> findLocalidadesByMunicipios(Long idmunicipio, Long idestado);

} 
