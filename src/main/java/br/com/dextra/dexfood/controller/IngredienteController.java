package br.com.dextra.dexfood.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dextra.dexfood.model.Ingrediente;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Ingrediente> getIngredientes() {
		List<Ingrediente> ingredientes = Arrays.asList(Ingrediente.values());
		return ingredientes;
	}

}
