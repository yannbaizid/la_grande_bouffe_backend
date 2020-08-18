package org.baizid.yann.lagrandebouffebackend.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class IngredientQuantified {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	float quantity;

	@ManyToOne
	Ingredient ingredient;
	@ManyToOne
	MeasurementUnit measurmentUnit;

}
