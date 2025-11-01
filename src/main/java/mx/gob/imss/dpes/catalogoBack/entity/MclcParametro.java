package mx.gob.imss.dpes.catalogoBack.entity;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.entity.LogicDeletedEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "MCLC_PARAMETRO")
public class MclcParametro extends LogicDeletedEntity<Long> {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_PARAMETRO")
    @Getter
    @Setter
    private Long id;

    @Size(max = 200)
    @Column(name = "PARAMETRO")
    @Getter
    @Setter
    private String parametro;

    @Size(max = 200)
    @Column(name = "VALOR")
    @Getter
    @Setter
    private String valor;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MclcParametro)) {
            return false;
        }
        MclcParametro other = (MclcParametro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
}
