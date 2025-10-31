/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.catalogoBack.endpoint;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import mx.gob.imss.dpes.catalogoBack.entity.MclcEstadoNotificacion;
import mx.gob.imss.dpes.catalogoBack.service.MclcEstadoNotificacionService;
import mx.gob.imss.dpes.common.endpoint.BaseGUIEndPoint;
import mx.gob.imss.dpes.common.exception.BusinessException;

/**
 *
 * @author edgar.arenas
 */
@ApplicationScoped
@Path("")
public class MclcEstadoNotificacionEndPoint extends BaseGUIEndPoint<MclcEstadoNotificacion, MclcEstadoNotificacion, MclcEstadoNotificacion>{
    
    @Inject
    private MclcEstadoNotificacionService service;

    @GET
    @Path("/notificacion/estado")
    @Produces(MediaType.APPLICATION_JSON)
    public Response load() throws BusinessException {
        return Response.ok(service.getAll()).build();
    }
}
