package mx.gob.imss.dpes.catalogoBack.service;

import mx.gob.imss.dpes.baseback.service.BaseCRUDService;
import mx.gob.imss.dpes.catalogoBack.entity.MclcParametro;
import mx.gob.imss.dpes.catalogoBack.exception.ParametroException;
import mx.gob.imss.dpes.catalogoBack.repository.MclcParametroRepository;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.support.config.CustomSpringBeanAutowiringInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.interceptor.Interceptors;
import javax.ws.rs.ext.Provider;
import java.util.List;
import java.util.logging.Level;

@Provider
@Interceptors(CustomSpringBeanAutowiringInterceptor.class)
public class MclcParametroService
        extends BaseCRUDService<MclcParametro, MclcParametro, Long, Long> {

    @Autowired
    private MclcParametroRepository repository;

    public List<MclcParametro> getParametros() throws BusinessException {
        try {
            return repository.findByBajaRegistroIsNullOrderByIdAsc();
        } catch (Exception e) {
            log.log(Level.SEVERE,
                "ERROR MclcParametroService.getParametros", e);
            throw new ParametroException(ParametroException.ERROR_DE_LECTURA_DE_BD);
        }
    }
    public MclcParametro getParametroPorId(Long id) throws BusinessException {
        try {
            return repository.findByIdAndBajaRegistroIsNull(id);
        }catch (Exception e) {
            log.log(Level.SEVERE,
                "ERROR MclcParametroService.getParametroPorId - id = [" +
                    id + "]", e);
            throw new ParametroException(ParametroException.ERROR_DE_LECTURA_DE_BD);
        }
    }

    @Override
    public JpaSpecificationExecutor<MclcParametro> getRepository() {
        return repository;
    }

    @Override
    public JpaRepository<MclcParametro, Long> getJpaRepository() {
        return repository;
    }

}
