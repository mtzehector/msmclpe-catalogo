package mx.gob.imss.dpes.catalogoBack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcSubTipoNotificacion;

/**
 *
 * @author juc
 */
public interface MclcSubTipoNotificacionRepository
		extends JpaRepository<MclcSubTipoNotificacion, Long>, JpaSpecificationExecutor<MclcSubTipoNotificacion> {

	public List<MclcSubTipoNotificacion> findAllByOrderByDescripcionAsc();
        public List<MclcSubTipoNotificacion> findByCveTipoNotificacion(Long cveTipoNotificacion);

}
