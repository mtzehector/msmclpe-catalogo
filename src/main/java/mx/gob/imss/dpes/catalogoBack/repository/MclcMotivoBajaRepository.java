package mx.gob.imss.dpes.catalogoBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoBaja;

/**
 *
 * @author juc
 */
public interface MclcMotivoBajaRepository
		extends JpaRepository<MclcMotivoBaja
		, Long>, JpaSpecificationExecutor<MclcMotivoBaja> {

}
