package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoPrestamoBaja;
import mx.gob.imss.dpes.catalogoBack.repository.MclcMotivoPrestamoBajaRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcMotivoPrestamoBajaService extends BaseCRUDService<MclcMotivoPrestamoBaja, MclcMotivoPrestamoBaja, Long, Long> {

	@Autowired
	private MclcMotivoPrestamoBajaRepository repository;

	public List<MclcMotivoPrestamoBaja> getAll() {
		return repository.findAll();
	}

	@Override
	public JpaSpecificationExecutor<MclcMotivoPrestamoBaja> getRepository() {
		return repository;
	}

	@Override
	public JpaRepository<MclcMotivoPrestamoBaja, Long> getJpaRepository() {
		return repository;
	}

}
