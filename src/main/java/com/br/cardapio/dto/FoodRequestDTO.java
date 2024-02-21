package com.br.cardapio.dto;

import com.br.cardapio.model.Food;

public record FoodRequestDTO(String title, String image, Integer price) {
	
	public FoodRequestDTO(Food food){
        this(food.getTitle(), food.getImage(), food.getPrice());
    }
}
