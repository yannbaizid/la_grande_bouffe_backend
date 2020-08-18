package org.baizid.yann.lagrandebouffebackend.dao;

import org.baizid.yann.lagrandebouffebackend.bo.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientDao extends CrudRepository<Ingredient, Integer> {

}
