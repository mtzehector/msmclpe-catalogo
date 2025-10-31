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

import mx.gob.imss.dpes.catalogoBack.exception.MclcEfException;
import mx.gob.imss.dpes.common.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcEntidadFinanciera;
import mx.gob.imss.dpes.catalogoBack.repository.MclcEfRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcEfService extends BaseCRUDService<MclcEntidadFinanciera, MclcEntidadFinanciera, Long, Long> {

    @Autowired
    private MclcEfRepository repository;

    public List<MclcEntidadFinanciera> getAll() throws BusinessException {
        try {
            return repository.findAllByOrderByNombreComercialAsc();
        }catch (Exception e){
            log.log(Level.SEVERE, "ERROR MclcEfService.getAll()", e);
            throw new MclcEfException(MclcEfException.ERROR_DE_LECTURA_DE_BD);
        }

    }

    public List<MclcEntidadFinanciera> obtenerListEntidades(Short estadoEF) throws BusinessException {
        try {
            return repository.findByEstadoEFOrderByNombreComercialAsc(estadoEF);
        }catch (Exception e){
            log.log(Level.SEVERE, "ERROR MclcEfService.obtenerEntidadesActivas()", e);
            throw new MclcEfException(MclcEfException.ERROR_DE_LECTURA_DE_BD);
        }

    }

    @Override
    public JpaSpecificationExecutor<MclcEntidadFinanciera> getRepository() {
        return repository;
    }

    @Override
    public JpaRepository<MclcEntidadFinanciera, Long> getJpaRepository() {
        return repository;
    }

}
