package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcEstadoEf;
import mx.gob.imss.dpes.catalogoBack.repository.MclcEstadoEfRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcEstadoEfService extends BaseCRUDService<MclcEstadoEf, MclcEstadoEf, Long, Long> {
    
    @Autowired
    private MclcEstadoEfRepository repository;
    
    public List<MclcEstadoEf> getAll(){
        return repository.findAll();
    }

    @Override
    public JpaSpecificationExecutor<MclcEstadoEf> getRepository() {
        return repository;
    }

    @Override
    public JpaRepository<MclcEstadoEf, Long> getJpaRepository() {
        return repository;
    }
    
}
