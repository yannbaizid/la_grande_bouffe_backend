package org.baizid.yann.lagrandebouffebackend.services;

import java.util.List;
import java.util.Optional;

import org.baizid.yann.lagrandebouffebackend.bo.IngredientQuantified;
import org.baizid.yann.lagrandebouffebackend.dao.IngredientQuantifiedDao;
import org.springframework.beans.factory.annotation.Autowired;

public class IngredientQuantifiedServiceImpl implements IngredientQuantifiedService {
 @Autowired
 IngredientQuantifiedDao ingredientQuantifiedDao;
	@Override
	public IngredientQuantified save(IngredientQuantified object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<IngredientQuantified> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IngredientQuantified> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
