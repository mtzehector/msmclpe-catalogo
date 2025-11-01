package mx.gob.imss.dpes.catalogoBack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcTipoNotificacion;

/**
 *
 * @author juc
 */
public interface MclcTipoNotificacionRepository
		extends JpaRepository<MclcTipoNotificacion, Long>, JpaSpecificationExecutor<MclcTipoNotificacion> {

	public List<MclcTipoNotificacion> findAllByOrderByDescripcionAsc();

}
