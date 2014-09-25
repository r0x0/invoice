package org.x0r.invoicer.entity.enums;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.x0r.invoicer.entity.basic.GenericEntity;


@Entity
@Table(name="EnumAddrStreetPrefix")
public class EnumAddrStreetPrefix extends GenericEntity {

	/**  */
	private static final long serialVersionUID = 4257968750152980117L;
	
	@Column(name="name")
	private String name;
	
	@Column(name="nprefix")
	private String prefix;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	

}
