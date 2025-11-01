package mx.gob.imss.dpes.catalogoBack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.entity.LogicDeletedEntity;

@Entity
@Table(name = "MCLC_ENTIDAD_FINANCIERA")
public class MclcEntidadFinanciera extends LogicDeletedEntity<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "CVE_ENTIDAD_FINANCIERA")
    @Getter
    @Setter
    private Long id;

    @Size(max = 200)
    @Column(name = "NOM_COMERCIAL")
    @Getter
    @Setter
    private String nombreComercial;

    @Size(max = 200)
    @Column(name = "NOM_RAZON_SOCIAL")
    @Getter
    @Setter
    private String razonSocial;

    @Column(name = "CVE_ENTIDAD_FINANCIERA_SIPRE")
    @Getter
    @Setter
    private String idSipre;

    @Column(name = "CVE_ESTADO_ENT_FINANCIERA")
    @Getter
    @Setter
    private Short estadoEF;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MclcEntidadFinanciera)) {
            return false;
        }
        MclcEntidadFinanciera other = (MclcEntidadFinanciera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
