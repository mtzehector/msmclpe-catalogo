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
import mx.gob.imss.dpes.catalogoBack.entity.MclcEstadoNotificacion;
import mx.gob.imss.dpes.catalogoBack.entity.MclcTipoNotificacion;
import mx.gob.imss.dpes.catalogoBack.repository.MclcEstadoNotificacionRepository;
import mx.gob.imss.dpes.catalogoBack.repository.MclcTipoNotificacionRepository;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author edgar.arenas
 */
@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcEstadoNotificacionService extends BaseCRUDService<MclcEstadoNotificacion, MclcEstadoNotificacion, Long, Long> {
    
    @Autowired
    private MclcEstadoNotificacionRepository repository;

	public List<MclcEstadoNotificacion> getAll() {
		return repository.findAllByOrderByDescripcionAsc();
	}

	@Override
	public JpaSpecificationExecutor<MclcEstadoNotificacion> getRepository() {
		return repository;
	}

	@Override
	public JpaRepository<MclcEstadoNotificacion, Long> getJpaRepository() {
		return repository;
	}
}
