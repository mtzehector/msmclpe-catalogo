package mx.gob.imss.dpes.catalogoBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcEstadoSolicitud;

/**
 *
 * @author juc
 */
public interface MclcEstadoSolicitudRepository extends JpaRepository<MclcEstadoSolicitud, Long>,
        JpaSpecificationExecutor<MclcEstadoSolicitud> {
    
}
