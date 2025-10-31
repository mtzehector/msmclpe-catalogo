package mx.gob.imss.dpes.catalogoBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoPrestamoCancel;

/**
 *
 * @author juc
 */
public interface MclcMotivoPrestamoCancelacionRepository
		extends JpaRepository<MclcMotivoPrestamoCancel
		, Long>, JpaSpecificationExecutor<MclcMotivoPrestamoCancel> {

}
