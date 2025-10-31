package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcSubTipoNotificacion;
import mx.gob.imss.dpes.catalogoBack.model.Notificacion;
import mx.gob.imss.dpes.catalogoBack.repository.MclcSubTipoNotificacionRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcSubTipoNotificacionService
		extends BaseCRUDService<MclcSubTipoNotificacion, MclcSubTipoNotificacion, Long, Long> {

	@Autowired
	private MclcSubTipoNotificacionRepository repository;

	public List<MclcSubTipoNotificacion> getAll() {
		return repository.findAllByOrderByDescripcionAsc();
	}
        
        public List<MclcSubTipoNotificacion> getSubTipoNotificacion(Notificacion request) {
		return repository.findByCveTipoNotificacion(request.getCveTipoNotificacion());
	}

	@Override
	public JpaSpecificationExecutor<MclcSubTipoNotificacion> getRepository() {
		return repository;
	}

	@Override
	public JpaRepository<MclcSubTipoNotificacion, Long> getJpaRepository() {
		return repository;
	}

}
