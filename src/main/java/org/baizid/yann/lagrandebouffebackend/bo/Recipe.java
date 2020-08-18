package org.baizid.yann.lagrandebouffebackend.bo;

import java.util.ArrayList;
import java.util.List;

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
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String name;
	
	int difficulty;
	int preparationTime;
	int personsServed;
	
	@ManyToOne
	List<IngredientQuantified> ingredientQuantifiedList;

	@ManyToOne
	List<RecipeStep> DescriptionSteps;
}
