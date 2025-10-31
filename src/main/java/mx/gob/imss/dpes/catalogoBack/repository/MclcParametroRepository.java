package mx.gob.imss.dpes.catalogoBack.repository;

import mx.gob.imss.dpes.catalogoBack.entity.MclcParametro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface MclcParametroRepository extends JpaRepository<MclcParametro, Long>,
        JpaSpecificationExecutor<MclcParametro> {
    public List<MclcParametro> findByBajaRegistroIsNullOrderByIdAsc();
    public MclcParametro findByIdAndBajaRegistroIsNull(Long id);
}
