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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import mx.gob.imss.dpes.catalogoBack.entity.MclcBancos;
import mx.gob.imss.dpes.catalogoBack.entity.MclcDelegaciones;
import mx.gob.imss.dpes.catalogoBack.exception.DelegacionException;
import mx.gob.imss.dpes.catalogoBack.service.MclcBancosService;
import mx.gob.imss.dpes.catalogoBack.service.MclcDelegacionesService;
import mx.gob.imss.dpes.common.endpoint.BaseGUIEndPoint;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.common.model.ServiceStatusEnum;

import java.util.logging.Level;

/**
 *
 * @author juan.garfias
 */
@ApplicationScoped
@Path("delegaciones")
public class MclcDelegacionesEndPoint extends BaseGUIEndPoint<MclcBancos, MclcBancos, MclcBancos> {
    
    @Inject
    private MclcDelegacionesService service;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response load() throws BusinessException {
        return Response.ok(service.getAllDelegaciones()).build();
    }

    @GET
    @Path("/{numDelegacion}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDelegacionPorNumDelegacion(@PathParam("numDelegacion") String numDelegacion) {
        try {
            MclcDelegaciones delegacion = service.getDelegacionPorNumDelegacion(numDelegacion);

            if(delegacion != null)
                return Response.ok(delegacion).build();
            else
                return Response.noContent().build();
        } catch (BusinessException be) {
            return toResponse(new Message(null, ServiceStatusEnum.EXCEPCION, be, null));
        } catch (Exception e) {
            log.log(Level.SEVERE,
                    "ERROR MclcDelegacionesEndPoint.getDelegacionPorNumDelegacion - numDelegacion = [" +
                            numDelegacion + "]", e);
            return toResponse(new Message(null, ServiceStatusEnum.EXCEPCION,
                    new DelegacionException(DelegacionException.ERROR_DESCONOCIDO_EN_EL_SERVICIO),
                    null));
        }
    }
}
