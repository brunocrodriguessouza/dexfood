package br.com.dextra.dexfood.controller;

public class IngredienteController {

	// @Autowired
	// private IngredienteRepository ingredienteRepository;
	//
	// @GetMapping
	// public List<Ingrediente> listar() {
	// return (List<Ingrediente>) ingredienteRepository.findAll();
	// }
	//
	// @Autowired
	// private ApplicationEventPublisher publisher;
	//
	// @GetMapping("/{id}")
	// public Ingrediente buscarPeloId(@PathVariable Long id) {
	// return ingredienteRepository.findOne(id);
	// }
	//
	// @PostMapping
	// @ResponseStatus(HttpStatus.CREATED)
	// public ResponseEntity<Ingrediente> criar(@Valid @RequestBody Ingrediente
	// ingrediente,
	// HttpServletResponse response) {
	// Ingrediente ingredienteSalvo = ingredienteRepository.save(ingrediente);
	//
	// publisher.publishEvent(new RecursoCriadoEvent(this, response,
	// ingredienteSalvo.getId()));
	//
	// return ResponseEntity.status(HttpStatus.CREATED).body(ingredienteSalvo);
	// }

}
