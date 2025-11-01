package mx.gob.imss.dpes.catalogoBack.exception;

import mx.gob.imss.dpes.common.exception.BusinessException;

public class ParametroException extends BusinessException {
    public final static String ERROR_DESCONOCIDO_EN_EL_SERVICIO = "err001";
    public final static String ERROR_DE_LECTURA_DE_BD = "err002";

    public ParametroException(String causa) {
        super(causa);
    }
}
