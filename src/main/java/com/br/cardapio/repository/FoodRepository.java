package com.br.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cardapio.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
