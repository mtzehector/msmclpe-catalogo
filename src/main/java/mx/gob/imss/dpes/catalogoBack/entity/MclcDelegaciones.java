/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.catalogoBack.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.entity.LogicDeletedEntity;

/**
 *
 * @author juan.garfias
 */
@Entity
@Table(name = "MCLC_DELEGACION")
public class MclcDelegaciones extends LogicDeletedEntity<Long> {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVE_DELEGACION")
    @Getter
    @Setter
    private Long id;

    @Column(name = "DES_DELEGACION")
    @Getter
    @Setter
    private String desDelegacion;

    @Column(name = "NUM_DELEGACION")
    @Getter
    @Setter
    private String numDelegacion;

}
