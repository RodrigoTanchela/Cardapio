package com.br.cardapio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cardapio.dto.FoodRequestDTO;
import com.br.cardapio.dto.FoodResponseDTO;
import com.br.cardapio.model.Food;
import com.br.cardapio.repository.FoodRepository;


@Service
public class FoodService {
	
	@Autowired
	private FoodRepository repository;
	
	public List<FoodResponseDTO> buscarTodos() {
		 List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
	     return foodList;
	}
	
	public void inserir(FoodRequestDTO food) {
		Food foodData = new Food(food);
        repository.save(foodData);
	}
}
