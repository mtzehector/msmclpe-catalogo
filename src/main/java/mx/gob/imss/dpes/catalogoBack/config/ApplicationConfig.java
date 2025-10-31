/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.catalogoBack.config;

import java.util.Set;

import javax.ws.rs.core.Application;

/**
 *
 * @author juc
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		return resources;
	}

	/**
	 * Do not modify addRestResourceClasses() method. It is automatically populated
	 * with all resources defined in the project. If required, comment out calling
	 * this method in getClasses().
	 */
	private void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcBancosEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcDelegacionesEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcEfEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcEstadoEfEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcEstadoNotificacionEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcEstadoSolicitudEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcMotivoBajaEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcMotivoPrestamoBajaEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcMotivoPrestamoCancelacionEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcMotivoPrestamoSuspensionEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcParametroEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcSubTipoNotificacionEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.endpoint.MclcTipoNotificacionEndPoint.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcBancosService.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcDelegacionesService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcEfService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcEstadoEfService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcEstadoNotificacionService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcEstadoSolicitudService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcMotivoBajaService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcMotivoPrestamoBajaService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcMotivoPrestamoCancelacionService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcMotivoPrestamoSuspensionService.class);
		resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcParametroService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcSubTipoNotificacionService.class);
        resources.add(mx.gob.imss.dpes.catalogoBack.service.MclcTipoNotificacionService.class);
        resources.add(mx.gob.imss.dpes.common.exception.AlternateFlowMapper.class);
        resources.add(mx.gob.imss.dpes.common.exception.BusinessMapper.class);
        resources.add(mx.gob.imss.dpes.common.rule.MontoTotalRule.class);
        resources.add(mx.gob.imss.dpes.common.rule.PagoMensualRule.class);

	}

}
