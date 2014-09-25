
package org.x0r.invoicer.entity.basic;


import java.io.File;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;



/**
 * <pre>
 *    More complex class extend {@link GenericEntity} and ill be used in the same way;
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class GenEntityReach extends GenericEntity {

    @Column(name = "description")
    private String description;

    @Column(name = "asociateFileList")
    @OneToMany()
    private List<File> asociateFileList;

}
