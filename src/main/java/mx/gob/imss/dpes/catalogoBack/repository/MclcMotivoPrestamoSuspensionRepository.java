package mx.gob.imss.dpes.catalogoBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoPrestamoSuspen;

/**
 *
 * @author juc
 */
public interface MclcMotivoPrestamoSuspensionRepository
		extends JpaRepository<MclcMotivoPrestamoSuspen
		, Long>, JpaSpecificationExecutor<MclcMotivoPrestamoSuspen> {

}
