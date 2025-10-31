package mx.gob.imss.dpes.catalogoBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoPrestamoBaja;

/**
 *
 * @author juc
 */
public interface MclcMotivoPrestamoBajaRepository
		extends JpaRepository<MclcMotivoPrestamoBaja
		, Long>, JpaSpecificationExecutor<MclcMotivoPrestamoBaja> {

}
