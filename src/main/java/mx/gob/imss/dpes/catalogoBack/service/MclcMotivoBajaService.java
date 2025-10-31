package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoBaja;
import mx.gob.imss.dpes.catalogoBack.repository.MclcMotivoBajaRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcMotivoBajaService extends BaseCRUDService<MclcMotivoBaja, MclcMotivoBaja, Long, Long> {

	@Autowired
	private MclcMotivoBajaRepository repository;

	public List<MclcMotivoBaja> getAll() {
		return repository.findAll();
	}

	@Override
	public JpaSpecificationExecutor<MclcMotivoBaja> getRepository() {
		return repository;
	}

	@Override
	public JpaRepository<MclcMotivoBaja, Long> getJpaRepository() {
		return repository;
	}

}
