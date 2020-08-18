package org.baizid.yann.lagrandebouffebackend.dao;

import org.baizid.yann.lagrandebouffebackend.bo.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<Recipe, Integer> {

}
