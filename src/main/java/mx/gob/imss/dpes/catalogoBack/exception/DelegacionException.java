package mx.gob.imss.dpes.catalogoBack.exception;

import mx.gob.imss.dpes.common.exception.BusinessException;

public class DelegacionException extends BusinessException {
    public final static String ERROR_DESCONOCIDO_EN_EL_SERVICIO = "err001";
    public final static String ERROR_DE_LECTURA_DE_BD = "err002";

    public DelegacionException(String causa) {
        super(causa);
    }
}
