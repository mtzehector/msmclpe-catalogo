package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoPrestamoSuspen;
import mx.gob.imss.dpes.catalogoBack.repository.MclcMotivoPrestamoSuspensionRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcMotivoPrestamoSuspensionService extends BaseCRUDService<MclcMotivoPrestamoSuspen, MclcMotivoPrestamoSuspen, Long, Long> {

	@Autowired
	private MclcMotivoPrestamoSuspensionRepository repository;

	public List<MclcMotivoPrestamoSuspen> getAll() {
		return repository.findAll();
	}

	@Override
	public JpaSpecificationExecutor<MclcMotivoPrestamoSuspen> getRepository() {
		return repository;
	}

	@Override
	public JpaRepository<MclcMotivoPrestamoSuspen, Long> getJpaRepository() {
		return repository;
	}

}
