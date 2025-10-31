/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.catalogoBack.repository;

import java.util.List;
import mx.gob.imss.dpes.catalogoBack.entity.MclcEstadoNotificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author edgar.arenas
 */
public interface MclcEstadoNotificacionRepository extends JpaRepository<MclcEstadoNotificacion, Long>, JpaSpecificationExecutor<MclcEstadoNotificacion> {
    
    public List<MclcEstadoNotificacion> findAllByOrderByDescripcionAsc();

}
