package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcTipoNotificacion;
import mx.gob.imss.dpes.catalogoBack.repository.MclcTipoNotificacionRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcTipoNotificacionService
		extends BaseCRUDService<MclcTipoNotificacion, MclcTipoNotificacion, Long, Long> {

	@Autowired
	private MclcTipoNotificacionRepository repository;

	public List<MclcTipoNotificacion> getAll() {
		return repository.findAllByOrderByDescripcionAsc();
	}

	@Override
	public JpaSpecificationExecutor<MclcTipoNotificacion> getRepository() {
		return repository;
	}

	@Override
	public JpaRepository<MclcTipoNotificacion, Long> getJpaRepository() {
		return repository;
	}

}
