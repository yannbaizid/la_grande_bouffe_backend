package org.baizid.yann.lagrandebouffebackend.services;

import java.util.List;
import java.util.Optional;

import org.baizid.yann.lagrandebouffebackend.bo.Recipe;
import org.baizid.yann.lagrandebouffebackend.dao.RecipeDao;
import org.springframework.beans.factory.annotation.Autowired;

public class RecipeServiceImpl implements RecipeService {
	@Autowired
	RecipeDao recipeDao;

	@Override
	public Recipe save(Recipe object) {
		// TODO Auto-generated method stub
		return recipeDao.save(object);
	}

	@Override
	public Optional<Recipe> findById(int id) {
		// TODO Auto-generated method stub
		return recipeDao.findById(id);
	}

	@Override
	public List<Recipe> findAll() {
		// TODO Auto-generated method stub
		return (List<Recipe>)recipeDao.findAll();
	}

}
