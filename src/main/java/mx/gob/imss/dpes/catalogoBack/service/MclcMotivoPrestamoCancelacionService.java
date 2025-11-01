package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoPrestamoCancel;
import mx.gob.imss.dpes.catalogoBack.repository.MclcMotivoPrestamoCancelacionRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcMotivoPrestamoCancelacionService extends BaseCRUDService<MclcMotivoPrestamoCancel, MclcMotivoPrestamoCancel, Long, Long> {

	@Autowired
	private MclcMotivoPrestamoCancelacionRepository repository;

	public List<MclcMotivoPrestamoCancel> getAll() {
		return repository.findAll();
	}

	@Override
	public JpaSpecificationExecutor<MclcMotivoPrestamoCancel> getRepository() {
		return repository;
	}

	@Override
	public JpaRepository<MclcMotivoPrestamoCancel, Long> getJpaRepository() {
		return repository;
	}

}
