package org.baizid.yann.lagrandebouffebackend.dao;

import org.baizid.yann.lagrandebouffebackend.bo.RecipeSteps;
import org.springframework.data.repository.CrudRepository;

public interface RecipeStepDao extends CrudRepository<RecipeSteps, Integer> {

}
