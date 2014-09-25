
package org.x0r.invoicer.entity.basic.constdata;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.x0r.invoicer.entity.basic.GenericEntity;



/**
 * <pre>
 *    Constant company data
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.1
 */
@Entity
@Table(name = "CompanyData")
public class CompanyData extends GenericEntity {

    @Column(name = "ownerName")
    private String ownerName;

    @Column(name = "ownerName")
    private String ownerSurname;

    @Column(name = "companyName", nullable = false)
    private String companyName;

    @Column(name = "refVAT")
    private String refVAT;

    @Column(name = "idVAT")
    private String idVAT;

}
