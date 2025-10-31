package mx.gob.imss.dpes.catalogoBack.endpoint;

import mx.gob.imss.dpes.catalogoBack.entity.MclcEntidadFinanciera;
import mx.gob.imss.dpes.catalogoBack.exception.ParametroException;
import mx.gob.imss.dpes.catalogoBack.service.MclcParametroService;
import mx.gob.imss.dpes.common.endpoint.BaseGUIEndPoint;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.common.model.ServiceStatusEnum;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.logging.Level;

@ApplicationScoped
@Path("/parametro")
public class MclcParametroEndPoint extends BaseGUIEndPoint<MclcEntidadFinanciera, MclcEntidadFinanciera, MclcEntidadFinanciera> {
    @Context
    private UriInfo uriInfo;
    @Inject
    private MclcParametroService service;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getParametros() {
        try {
            return Response.ok(service.getParametros()).build();
        } catch (BusinessException be) {
            return toResponse(new Message(null, ServiceStatusEnum.EXCEPCION, be, null));
        } catch (Exception e) {
            log.log(Level.SEVERE,
                "ERROR MclcParametroEndPoint.getParametros", e);
            return toResponse(new Message(null, ServiceStatusEnum.EXCEPCION,
                new ParametroException(ParametroException.ERROR_DESCONOCIDO_EN_EL_SERVICIO),
                null));
        }
    }

    @GET
    @Path("/{idParametro}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getParametroPorId(@PathParam("idParametro") Long id) {
        try {
                return Response.ok(service.getParametroPorId(id)).build();
        } catch (BusinessException be) {
            return toResponse(new Message(null, ServiceStatusEnum.EXCEPCION, be, null));
        } catch (Exception e) {
            log.log(Level.SEVERE,
                "ERROR MclcParametroEndPoint.getParametroPorId - idParametro = [" + id + "]", e);
            return toResponse(new Message(null, ServiceStatusEnum.EXCEPCION,
                new ParametroException(ParametroException.ERROR_DESCONOCIDO_EN_EL_SERVICIO),
                    null));
        }
    }
   
}
