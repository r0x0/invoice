
package org.x0r.invoicer.entity.basic;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



/**
 * <pre>
 *     Base for other classes using person.
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.2
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 5874687155183652078L;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;


    public Person() {
        name = null;
        surname = null;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getSurname() {
        return this.surname;
    }

}
