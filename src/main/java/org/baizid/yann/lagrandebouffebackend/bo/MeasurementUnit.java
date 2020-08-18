package org.baizid.yann.lagrandebouffebackend.bo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class MeasurementUnit {

	
	@Id
	int id;
	String name;
}
