/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;
import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;
import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcBancos;
import mx.gob.imss.dpes.catalogoBack.repository.MclcBancosRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author juan.garfias
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcBancosService extends
        BaseCRUDService<MclcBancos, MclcBancos, Long, Long> {

    public List<MclcBancos> getAllActivos() {
        return repository.findByActivoOrderByDescripcion(1);
    }
    
    @Autowired
    private MclcBancosRepository repository;

    @Override
    public JpaSpecificationExecutor<MclcBancos> getRepository() {
        return repository;
    }

    @Override
    public JpaRepository<MclcBancos, Long> getJpaRepository() {
        return repository;
    }

    
    
}
