package mx.gob.imss.dpes.catalogoBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcEstadoEf;

/**
 *
 * @author juc
 */
public interface MclcEstadoEfRepository extends JpaRepository<MclcEstadoEf, Long>,
        JpaSpecificationExecutor<MclcEstadoEf> {
    
}
