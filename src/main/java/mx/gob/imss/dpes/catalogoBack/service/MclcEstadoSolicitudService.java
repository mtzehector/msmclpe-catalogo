/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.catalogoBack.service;

import java.util.List;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcEstadoSolicitud;
import mx.gob.imss.dpes.catalogoBack.repository.MclcEstadoSolicitudRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;

/**
 *
 * @author juc
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcEstadoSolicitudService extends BaseCRUDService<MclcEstadoSolicitud, MclcEstadoSolicitud, Long, Long> {
    
    @Autowired
    private MclcEstadoSolicitudRepository repository;
    
    public List<MclcEstadoSolicitud> getAll(){
        return repository.findAll();
    }

    @Override
    public JpaSpecificationExecutor<MclcEstadoSolicitud> getRepository() {
        return repository;
    }

    @Override
    public JpaRepository<MclcEstadoSolicitud, Long> getJpaRepository() {
        return repository;
    }
    
}
