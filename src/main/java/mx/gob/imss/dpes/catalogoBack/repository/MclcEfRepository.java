package mx.gob.imss.dpes.catalogoBack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import mx.gob.imss.dpes.catalogoBack.entity.MclcEntidadFinanciera;

/**
 *
 * @author juc
 */
public interface MclcEfRepository extends JpaRepository<MclcEntidadFinanciera, Long>, JpaSpecificationExecutor<MclcEntidadFinanciera> {
	
	public List<MclcEntidadFinanciera> findAllByOrderByRazonSocialAsc();
	public List<MclcEntidadFinanciera> findAllByOrderByNombreComercialAsc();
	public List<MclcEntidadFinanciera> findByEstadoEFOrderByNombreComercialAsc(Short estadoEF);
    
}
