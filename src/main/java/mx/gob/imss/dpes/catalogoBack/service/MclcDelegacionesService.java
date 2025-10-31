/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;
import java.util.logging.Level;
import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;
import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcDelegaciones;
import mx.gob.imss.dpes.catalogoBack.exception.DelegacionException;
import mx.gob.imss.dpes.catalogoBack.repository.MclcDelegacionesRepository;
import mx.gob.imss.dpes.common.exception.BusinessException;
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
public class MclcDelegacionesService extends
        BaseCRUDService<MclcDelegaciones, MclcDelegaciones, Long, Long> {

    @Autowired
    private MclcDelegacionesRepository repository;

    public List<MclcDelegaciones> getAllDelegaciones() {
        return repository.findAll();
    }

    public MclcDelegaciones getDelegacionPorNumDelegacion(String numDelegacion) throws BusinessException {
        try {
            return repository.findByNumDelegacion(numDelegacion);
        } catch (Exception e) {
            log.log(Level.SEVERE, "ERROR MclcDelegacionesService.getDelegacionPorNumDelegacion ", e);
            throw new DelegacionException(DelegacionException.ERROR_DE_LECTURA_DE_BD);
        }
    }

    @Override
    public JpaSpecificationExecutor<MclcDelegaciones> getRepository() {
        return repository;
    }

    @Override
    public JpaRepository<MclcDelegaciones, Long> getJpaRepository() {
        return repository;
    }
}
