package com.br.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cardapio.dto.FoodRequestDTO;
import com.br.cardapio.dto.FoodResponseDTO;
import com.br.cardapio.service.FoodService;

@RestController
@RequestMapping("food")
public class FoodController {
	
	@Autowired
    private FoodService service;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        service.inserir(data);
    }
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping
	public List<FoodResponseDTO> getAll(){
		 List<FoodResponseDTO> foodList = service.buscarTodos();
	     return foodList;
	}
}
