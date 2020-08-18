package org.baizid.yann.lagrandebouffebackend.controllers;

import java.util.List;

import org.baizid.yann.lagrandebouffebackend.bo.Recipe;
import org.baizid.yann.lagrandebouffebackend.services.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
	@Autowired
	RecipeServiceImpl recipeService;

	@CrossOrigin
	@GetMapping("/findall")
	public List<Recipe> cinema() {
	 return recipeService.findAll();
	}
	
}
