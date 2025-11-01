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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import mx.gob.imss.dpes.catalogoBack.entity.MclcMotivoPrestamoCancel;
import mx.gob.imss.dpes.catalogoBack.service.MclcMotivoPrestamoCancelacionService;
import mx.gob.imss.dpes.common.endpoint.BaseGUIEndPoint;
import mx.gob.imss.dpes.common.exception.BusinessException;

/**
 *
 * @author juc
 */
@ApplicationScoped
@Path("")
public class MclcMotivoPrestamoCancelacionEndPoint extends BaseGUIEndPoint<MclcMotivoPrestamoCancel, MclcMotivoPrestamoCancel, MclcMotivoPrestamoCancel> {
	@Context
	private UriInfo uriInfo;
	@Inject
	private MclcMotivoPrestamoCancelacionService service;

	@GET
	@Path("/prestamo/motivoReanudar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response load() throws BusinessException {
		return Response.ok(service.getAll()).build();
	}

        
}
