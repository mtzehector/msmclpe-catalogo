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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import mx.gob.imss.dpes.catalogoBack.entity.MclcEntidadFinanciera;
import mx.gob.imss.dpes.catalogoBack.entity.MclcEstadoEf;
import mx.gob.imss.dpes.catalogoBack.exception.MclcEfException;
import mx.gob.imss.dpes.catalogoBack.service.MclcEfService;
import mx.gob.imss.dpes.common.endpoint.BaseGUIEndPoint;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.common.model.ServiceStatusEnum;

import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author juc
 */
@ApplicationScoped
@Path("")
public class MclcEfEndPoint extends BaseGUIEndPoint<MclcEstadoEf, MclcEstadoEf, MclcEstadoEf> {
    @Context
    private UriInfo uriInfo;
    @Inject
    private MclcEfService service;
    
    @GET
    @Path("/entidadFinanciera")
    @Produces(MediaType.APPLICATION_JSON)
    public Response load() throws BusinessException {
        try {
            return Response.ok(service.getAll()).build();
        }catch (BusinessException e){
            return toResponse(new Message<>(null, ServiceStatusEnum.EXCEPCION,e, null));
        }catch (Exception e){
            log.log(Level.SEVERE, "ERROR MclcEfEndPoint.load()", e);
            return toResponse(new Message<>(
                    null,
                    ServiceStatusEnum.EXCEPCION,
                    new MclcEfException(MclcEfException.ERROR_DESCONOCIDO_EN_EL_SERVICIO),
                    null
            ));
        }

    }

    @GET
    @Path("/entidadesFinancieras/{estadoEF}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerListaEntidadesFinancierasActivas(@PathParam("estadoEF") Short estadoEF) throws BusinessException {
        try {
            List<MclcEntidadFinanciera> lista = service.obtenerListEntidades(estadoEF);

            if (lista == null || lista.isEmpty())
                return Response.noContent().build();

            return Response.ok(lista).build();
        }catch (BusinessException e){
            return toResponse(new Message<>(null, ServiceStatusEnum.EXCEPCION,e, null));
        }catch (Exception e){
            log.log(Level.SEVERE, "ERROR MclcEfEndPoint.obtenerListaEntidadesFinancierasActivas()", e);
            return toResponse(new Message<>(
                    null,
                    ServiceStatusEnum.EXCEPCION,
                    new MclcEfException(MclcEfException.ERROR_DESCONOCIDO_EN_EL_SERVICIO),
                    null
            ));
        }
    }
    
   
}
