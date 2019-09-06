package br.com.dextra.dexfood.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import br.com.dextra.dexfood.event.RecursoCriadoEvent;
import br.com.dextra.dexfood.model.Ingrediente;
import br.com.dextra.dexfood.repository.IngredienteRepository;

@RestController
@RequestMapping("/ingredientes")
public class IngredienteController {

	@Autowired
	private IngredienteRepository ingredienteRepository;

	@GetMapping
	public List<Ingrediente> listar() {
		return (List<Ingrediente>) ingredienteRepository.findAll();
	}
	
	@Autowired
	private ApplicationEventPublisher publisher;

	@GetMapping("/{id}")
	public Ingrediente buscarPeloId(@PathVariable Long id) {
		return ingredienteRepository.findOne(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Ingrediente> criar(@Valid @RequestBody Ingrediente ingrediente,
			HttpServletResponse response) {
		Ingrediente ingredienteSalvo = ingredienteRepository.save(ingrediente);

		publisher.publishEvent(new RecursoCriadoEvent(this, response, ingredienteSalvo.getId()));

		return ResponseEntity.status(HttpStatus.CREATED).body(ingredienteSalvo);
	}

}
