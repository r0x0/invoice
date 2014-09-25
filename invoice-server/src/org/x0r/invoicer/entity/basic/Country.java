package org.x0r.invoicer.entity.basic;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



/**
 * <pre>
 *    Base country class
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.1
 */
@Entity
@Table(name = "Country")
public class Country extends GenericEntity {

    private static final long serialVersionUID = 2649860719507812031L;

    // *******************************************************************************************************************************
    // ****** Fields
    // *******************************************************************************************************************************
    @Column(name = "name")
    private String name;

    @Column(name = "nativeName")
    private String nativeName;

    @Column(name = "code")
    private String code;

    @Column(name = "codeEU")
    private String codeEU;

    @Column(name = "ISOCode")
    private String ISOCode;


    // *******************************************************************************************************************************
    // ****** GETTERS & SETTERS
    // *******************************************************************************************************************************

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getNativeName() {
        return this.nativeName;
    }


    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }


    public String getCode() {
        return this.code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getCodeEU() {
        return this.codeEU;
    }


    public void setCodeEU(String codeEU) {
        this.codeEU = codeEU;
    }


    public String getISOCode() {
        return this.ISOCode;
    }


    public void setISOCode(String iSOCode) {
        this.ISOCode = iSOCode;
    }
}
