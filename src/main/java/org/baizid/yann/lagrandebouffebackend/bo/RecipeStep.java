package org.baizid.yann.lagrandebouffebackend.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class RecipeSteps {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	
	String description;
}
